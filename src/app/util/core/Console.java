package app.util.core;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.regex.Pattern;

public class Console {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void end() { scanner.close(); }

    // Print    
    public static void printRaw(String step, String end, Object[] objects) {
        System.out.print(Any.toStringSafeArgs(step, end, objects));
    }

    public static void print(Object... objects) { printRaw(" ", "\n", objects); }
    public static void println(String nextLine, Object... objects) { printRaw(" ", nextLine, objects); }
    public static void printStep(String step, Object... objects) { printRaw(step, "\n", objects); }

    public static void space() {
        System.out.println();
    }

    public static void clear() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    public static void flush() {
        scanner.nextLine();
    }

    // Input
    public static int inputInt(String text) {
        System.out.print(text);
        while (true) {
            try { return scanner.nextInt(); } catch (Exception e) { 
                System.out.print("Digite um inteiro: ");
                flush();
                continue;
            }
        }
    }

    public static double inputDouble(String text) {
        System.out.print(text);
        while (true) {
            try { return scanner.nextDouble(); } catch (Exception e) { 
                System.out.print("Digite um inteiro: ");
                flush();
                continue;
            }
        }
    }

    public static String input(String text) {
        System.out.print(text);
        String exit = scanner.nextLine();
        return exit.trim();
    }

    // Highlevel
    public static boolean confirmation(String message, String regex) {
        System.out.print(message);
        if (regex.isEmpty()) return scanner.nextLine() != null;
        
        return Pattern.compile(regex).matcher(scanner.nextLine()).find();
    }

    public static boolean confirmation(String message) { return confirmation(message, ""); }
    public static boolean confirmation() { return confirmation("ENTER para continuar: ", "[\\s\\S]*"); }

    public static void box(BiFunction<String, Integer, String> format, String... lines) {
        String[] f = new String[lines.length];
        int big = 0;
        
        for (int index = 0; index < lines.length; index++) {
            String line = lines[index];
            f[index]    = format.apply(line, index);
            if (big < f[index].length()) big = f[index].length();
        }
        
        big += 2;
        String bar = ASCII.HLineDouble.repeat(big);
        big--;

        printStep("", ASCII.CornerTLDouble, bar, ASCII.CornerTRDouble);
        
        for (String line : f) {
            printStep("", ASCII.VLineDouble, " ", line, " ".repeat(big - line.length()), ASCII.VLineDouble);
        }

        printStep("", ASCII.CornerBLDouble, bar, ASCII.CornerBRDouble);
    }

    public static void box(String... lines) { box((line, index) -> { return line; }, lines); }

    public static int menu(String... args) {
        box(
            (value, index) -> {
                return Any.toStringSafeArgs(
                    "", 
                    "", 
                    new Object[] { "[", index, "]- ", value }
                );
            }, args
        );


        int option = -1;
        int max = args.length -1;

        while (option < 0 || option > max) {
            printRaw("", "", new Object[] { "Escolha [", 0, "/" , max, "]: " });
            option = inputInt("");
        }
        Console.flush();
        return option;
    }
}

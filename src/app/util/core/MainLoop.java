package app.util.core;

import java.util.Arrays;

public class MainLoop {
    static boolean loopStart = false;

    public static void init(Runnable run) {
        if (loopStart) return;
        loopStart = true;
        
        while (loopStart) {
            Console.clear();
            run.run();
        }
        
        Console.end();
    }

    public static void exit() { loopStart = false; }

    public static void error(String text) { 
        System.err.println(text);

        var stack = Arrays.copyOfRange(
            Thread.currentThread().getStackTrace(),
            1,
            Thread.currentThread().getStackTrace().length
        );

        for (var s : stack) System.err.println(s);


        System.exit(1);
    }


}

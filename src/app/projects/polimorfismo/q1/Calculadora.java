package app.projects.polimorfismo.q1;

import java.math.BigDecimal;
import java.util.Arrays;

public class Calculadora {
    public int soma(int x, int y) {
        return x + y;
    }

    public int soma(int x, int y, int z) {
        return x + y + z;
    }

    public double soma(double x , double y) {
        return decimal_sum(x, y);
    }

    public double decimal_sum(double... args) {
        BigDecimal total = new BigDecimal(Double.toString(args[0]));
        
        for (double x : Arrays.copyOfRange(args, 1, args.length)) {
            total = total.add(new BigDecimal(Double.toString(x)));
        }

        return total.doubleValue();
    }

    public double decimal_mul(double... args) {
        BigDecimal total = new BigDecimal(args[0]);
        
        for (double x : Arrays.copyOfRange(args, 1, args.length)) {
            total = total.multiply(new BigDecimal(Double.toString(x)));
        }
        
        return total.doubleValue();
    }
}

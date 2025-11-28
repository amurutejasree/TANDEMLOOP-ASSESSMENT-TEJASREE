// Program-1.java
import java.util.*;

class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                return b != 0 ? a / b : Double.NaN;
            default:
                System.out.println("Invalid Operation");
                return 0;
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next();

        Calculator c = new Calculator(a, b, op);
        System.out.println(c.calculate());
    }
}

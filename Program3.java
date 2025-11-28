// Program-3.java
import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // Determine k (largest odd <= a)
        int k = (a % 2 == 0) ? a - 1 : a;

        // Generate odd numbers up to (2*k - 1)
        for (int i = 1; i <= (2 * k - 1); i += 2) {
            System.out.print(i);
            if (i < (2 * k - 1)) System.out.print(", ");
        }
    }
}

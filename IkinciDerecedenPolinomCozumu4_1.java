import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class IkinciDerecedenPolinomCozumu4_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c;
        int n;

        System.out.println(
                "Basit olarak 2. dereceden polinom çözümü yapalım: \n=> P(x) = ax^n+-b+-c : n = Doğal sayı olmalı(0,1,2...)\n a eşit değil 0'a");
        System.out.println("\nSırası ile:");
        System.out.print("\na için = ");
        a = input.nextDouble();
        System.out.print("\nn için = ");
        n = input.nextInt();
        
        if (n < 0 || a == 0) {
            System.err.println("a == 0 ve n < 0 olamaz!");
            return;
        }
        
        System.out.print("\nb için = ");
        b = input.nextDouble();
        System.out.print("\nc için = ");
        c = input.nextDouble();

        double b2_4ac = b * b - 4 * a * c,
                D = Math.sqrt(b2_4ac),
                x1 = (-b + D) / (2 * a),
                x2 = (-b - D) / (2 * a);

        System.out.printf(
                "Diskriminant: D=b^2-4ac = %.0f\nKurulan Denklem: P(x) = %2.0fx^%d %2.0fx %2.0f",
                b2_4ac, a, n, b, c);

        if (D > 0) {
            System.out.printf(
                    "\nDiskriminant > 0 \nİki farklı kök var:\nx1 = %2.2f | x2 = %2.2f",
                    x1, x2);
        } else if (D == 0) {

            System.out.printf(
                    "\nDiskriminant = 0 \nKökler çakışık(aynı) dır:\nx1 = %2.2f | x2 = %2.2f",
                    x1, x2);

        } else {

            double D2 = Math.sqrt(-1 * b2_4ac);
            double x1_2 = (-b) / (2 * a);

            System.out.printf("\nD<0 olduğu için gerçek kök yoktur, kökler karmaşık sayılardı.\nx1 = %2.2f - %2.2fi | x2 = %2.2f + %2.2fi",
                    x1_2, D2, x1_2, D2);
        }

        System.out.println();

    }

}

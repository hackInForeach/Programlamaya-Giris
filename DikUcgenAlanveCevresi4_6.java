
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class DikUcgenAlanveCevresi4_6 {

    public static void main(String[] args) {

        System.out.println("""
                           Dik Üçgen:
                           Alan = (a * b) / 2
                           Çevre = a + b +(kök a^2+b^2)
                           """);
        Scanner input = new Scanner(System.in);
        
        System.out.println("1.Dik Kenar: ");
        double a = input.nextDouble();
        System.out.println("2.Dik Kenar: ");
        double b = input.nextDouble();
        
        double alan = (a * b)/2;
        double cevre = a + b + (Math.sqrt(a*a+b*b));
        
        System.out.printf("\nDik Üçgenin [Alanı: %.0fm^2 | Çevresi: %.0fcm]\n",alan,cevre);
        
        
    }

}

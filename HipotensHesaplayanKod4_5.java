
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class HipotensHesaplayanKod4_5 {

    public static void main(String[] args) {

        System.out.println("""
                           
                           h = kök a^2 + b^2
                           Dik Kenarlar = 90 derecenin komşu dikleri
                           
                           """);

        Scanner input = new Scanner(System.in);

        System.out.println("1.Dik Kenar: ");
        double a = input.nextDouble();
        System.out.println("2.Dik Kenar: ");
        double b = input.nextDouble();
        double formul = Math.sqrt(a * a + b * b);
        System.out.println("hipotenüs: " + formul);

    }
}

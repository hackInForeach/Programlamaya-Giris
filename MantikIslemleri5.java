
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class MantikIslemleri5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        int a = input.nextInt();
        System.out.println("Bir sayı daha girin: ");
        int b = input.nextInt();

        System.out.printf("\n%d büyük mü %d'den: %b",a,b, (a > b));
        System.out.printf("\n%d büyük eşit mi %d'den: %b",a,b, (a >= b));
        System.out.printf("\n%d küçük mü %d'den: %b",a,b, (a < b));
        System.out.printf("\n%d küçük eşit mi %d'den: %b",a,b, (a <= b));
        System.out.printf("\n%d eşit mi %d'e: %b",a,b, (a == b));
        System.out.printf("\n%d eşit değil mi %d'e: %b\n",a,b, (a != b));

    }

}

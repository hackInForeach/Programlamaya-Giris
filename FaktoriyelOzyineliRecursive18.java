
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class FaktoriyelOzyineliRecursive18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı girin: ");
        System.out.print("Faktöriyeli: " + (faktoriyel(input.nextInt())) + "\n");
    }

    public static int faktoriyel(int x) {

        if (x == 1) {// bu kısımda durdurma koşulumuz.
            return 1;
        }
        return x * faktoriyel(x - 1); // kendini azaltarak çağır
    }

}

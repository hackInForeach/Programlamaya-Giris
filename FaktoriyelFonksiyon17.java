
/**
 *
 * @author Dogukan
 */
public class FaktoriyelFonksiyon17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyelini görmek için bir sayı gir: ");
        int fk = input.nextInt();
        System.out.printf("%d! = %d dir.\n", fk, faktoriyel(fk));

    }

    public static int faktoriyel(int x) {

        for (int i = x - 1; i > 0; i--) {
            x *= i;
        }
        return x;
    }
}

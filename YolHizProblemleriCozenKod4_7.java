
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class YolHizProblemleriCozenKod4_7 {

    public static void main(String[] args) {

        System.out.println("""
                           hız = yol / zaman
                           Bu formülden yola çıkarak
                           Hangisini bulamak istediğini seç:
                           1-Yol
                           2-Hız
                           3-Zama
                           """);
        Scanner input = new Scanner(System.in);
        byte sec = input.nextByte();
        double yol, hiz, zaman, formul;
        switch (sec) {
            case 1:
                System.out.println("Hız: ");
                hiz = input.nextDouble();
                System.out.println("Zaman: ");
                zaman = input.nextDouble();
                formul = hiz * zaman;
                System.out.println("Yol: " + formul);
                break;
            case 2:
                System.out.println("Yol: ");
                yol = input.nextDouble();
                System.out.println("Zaman: ");
                zaman = input.nextDouble();
                formul = yol / zaman;
                System.out.println("Yol: " + formul);
                break;
            case 3:
                System.out.println("Hız: ");
                hiz = input.nextDouble();
                System.out.println("Yol: ");
                yol = input.nextDouble();
                formul = hiz / yol;
                System.out.println("Yol: " + formul);
                break;
            default:
                System.err.println("\nHATA 1,2,3 seç!");
        }

    }
}

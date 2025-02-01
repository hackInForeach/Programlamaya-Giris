
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class DikUcgenKontrolu7_1 {

    public static void main(String[] args) {

        System.out.println("Bir dik üçgrnin 'Dik Üçgen' olup olmadığını anlamak için:"
                + "\nAçı kullanacağız.");
        Scanner input = new Scanner(System.in);
        System.out.print("\n1.Açıyı Gir: ");
        int aci1 = input.nextInt();
        System.out.print("\n2.Açıyı Gir: ");
        int aci2 = input.nextInt();
        System.out.print("\n3.Açıyı Gir: ");
        int aci3 = input.nextInt();
        if (aci1 > 0 && aci2 > 0 && aci3 > 0) {
            if (aci1 == aci2 + aci3) {
                System.out.printf("Bu bir dik açı üçgendir: \nAçılar: %d, %d, %d\n", aci1, aci2, aci3);
            } else if (aci2 == aci1 + aci3) {
                System.out.printf("Bu bir dik açı üçgendir: \nAçılar: %d, %d, %d\n", aci1, aci2, aci3);
            } else if (aci3 == aci1 + aci2) {
                System.out.printf("Bu bir dik açı üçgendir: \nAçılar: %d, %d, %d\n", aci1, aci2, aci3);
            } else {

                System.out.printf("Bu bir dik açı üçgen değildir! : \nAçılar: %d, %d, %d\n", aci1, aci2, aci3);
            }
        } else {
            System.out.printf("Bu bir dik açı üçgen değildir! : \nAçılar: %d, %d, %d\n", aci1, aci2, aci3);
        }
    }
}

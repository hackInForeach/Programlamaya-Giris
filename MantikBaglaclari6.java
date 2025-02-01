
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class MantikBaglaclari6 {

    public static void main(String[] args) {

        System.out.println("Mantıksal Bağlaçkar: && => end => ve ,|| => or => veya");

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayı gir: ");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı gir: ");
        int sayi2 = input.nextInt();
        System.out.println("Üçüncü sayıyı gir: ");
        int sayi3 = input.nextInt();

        if (sayi1 >= sayi2 && sayi1 <= sayi3) {

            System.out.println(sayi1 + ", " + sayi2 + " ve " + sayi3 + "'ün arasında.");

        } else {
            System.err.println(sayi1 + ", " + sayi2 + " ve " + sayi3 + "'ün arasında değil.");
        }
        if (sayi1 == sayi2 && sayi1 < sayi3) {

            System.out.println(sayi1 + " eşit " + sayi2 + " ve " + sayi1 + ", " + sayi3 + "'den küçük.");

        } else {
            System.err.println(sayi1 + " eşit değil " + sayi2 + " veya " + sayi1 + ", " + sayi3 + "'den büyük.");
        }
        if (sayi1 > sayi2 || sayi1 > sayi3) {

            System.out.println(sayi1 + ", " + sayi2 + "'den veya " + sayi3 + "'den büyük.");

        } else {
            System.err.println(sayi1 + ", " + sayi2 + "'den veya " + sayi3 + "'den büyük değil.");
        }
        if (sayi1 == sayi2 && sayi2 == sayi3) {

            System.out.println(sayi1 + ", " + sayi2 + ", " + sayi3 + " birbirine eşittir..");

        } else {
            System.err.println(sayi1 + ", " + sayi2 + ", " + sayi3 + " birbirine eşit değil.");
        }
    }

}

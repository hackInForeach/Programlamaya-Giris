
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class UcSayidanEnBuyuguveEnKucugu7 {

    public static void main(String[] args) {

        System.out.println("Girilen Üç Sayıdan En Büyük ve En Küçük Olanını Hesaplayalım.");

        Scanner input = new Scanner(System.in);
        System.out.print("\n1.Sayıyı Gir: ");
        int sayi1 = input.nextInt();
        System.out.print("\n2.Sayıyı Gir: ");
        int sayi2 = input.nextInt();
        System.out.print("\n3.Sayıyı Gir: ");
        int sayi3 = input.nextInt();

        int max = sayi1, min = sayi1; // ras gele olarak bir değeri sabit tutuğumuzda daha kolaydır.

        if (max < sayi2) {max = sayi2;}
        if (max < sayi3) {max = sayi3;}
        if (min > sayi2) {min = sayi2;}
        if (min > sayi3) {min = sayi3;}
        
        System.out.printf("\nEn Büyük: %d | En Küçük: %d\n",max,min);
    }
}

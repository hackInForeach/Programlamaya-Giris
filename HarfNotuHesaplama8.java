
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class HarfNotuHesaplama8 {

    public static void main(String[] args) {

        System.out.println("Har notu hesaplama: \nGirilen not aralığı 0-100 aralığında olmalı.\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrencinin Tam Adı: ");
        String ogrenciName = input.nextLine();
        // Girdide TR karakterleri kullanmayın
        
        System.out.print("\nÖğrencinin Vize Sınav Puannı: ");
        byte vizeNot = input.nextByte();
        System.out.print("\nÖğrencinin Final Sınav Puannı: ");
        byte finalNot = input.nextByte();
        
        double not = vizeNot * 0.4 + finalNot * 0.6;
        
        if ((not >= 0 && not <= 100) && 
            (vizeNot >= 0 && vizeNot <= 100) && 
            (finalNot >= 0 && finalNot <= 100)) {
            
            not = Math.round(not);
            
            if (not >= 90) {
                System.out.printf("\nPekiyi: %.1f:AA\n", not);
            } else if (not >= 80) {
                System.out.printf("\nİyi: %.1f:BB\n", not);
            } else if (not >= 70) {
                System.out.printf("\nOrta: %.1f:CC\n", not);
            } else {
                System.err.printf("\nKaldı: %.1f:FF\n", not);
            }
        } else {
            System.err.printf(
                    "\nGirillen not %.1f! Girilen Not Hatalı!\n0-100 Aralığını Dene!\n"
                    , not);
        }

    }
}

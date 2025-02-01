
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author dogus
 */
public class GunSayisi4_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(""" 
                           Merhaba, Verilen tarihler arasındaki:
                           Yıl
                           Ay
                           Hafta
                           Gün
                           Saat
                           Dakika
                           Saniye
                           Salise
                           
                           Değerlerini Basan Mini Projemiz.
                           
                           Örn: yıl ay gün saat dakika saniye şeklinde olmalı.
                           1900
                           1
                           1
                           2025
                           12
                           12
                           """);

        System.out.println("1.Zaman dilimini giriniz: yıl ay gün:");
        LocalDate ilkTarih = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println("2.Zaman dilimini giriniz: yıl ay gün:");
        LocalDate ikinciTarih = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());

        long totalGun = Math.abs(ChronoUnit.DAYS.between(ikinciTarih, ilkTarih));

        long yil = totalGun / 365;
        long kalanGun = totalGun % 365;

        // Ay ve gün sayısını hesaplama
        int aySayisi = 0;
        while (kalanGun > 0) {
            aySayisi++;
            int gunSayisi = LocalDate.of(ilkTarih.getYear(), aySayisi, 1).lengthOfMonth(); // Ayın gün sayısını al
            if (kalanGun >= gunSayisi) {
                kalanGun -= gunSayisi; // Kalan günlerden ayın gün sayısını çıkar
            } else {
                aySayisi--; // Kalan gün kalmadı, bu ayı sayma
                break;
            }
        }

        long hafta = kalanGun / 7; // Kalan günleri haftaya çevir
        long gun = kalanGun % 7; // Kalan günler

        // Saat, dakika, saniye ve salise hesaplama
        long saat = gun * 24 - 1;         // Kalan gün üzerinden saat hesaplama
        long dakika = saat * 60 - 1;      // Saat üzerinden dakika
        long saniye = dakika * 60 - 1;    // Dakika üzerinden saniye
        long salise = saniye * 1000 - 1;  // Saniye üzerinden salise

        if (saat < 0 && dakika < 0 && saniye < 0 && salise < 0){saat=0; dakika=0; saniye=0; salise=0;}
        
        System.out.println("\n");
        System.out.printf("Yıl\t:\t%s\nAy\t:\t%s\nHafta\t:\t%s\nGün\t:\t%s\nSaat\t:\t%s\nDakika\t:\t%s\nSaniye\t:\t%s\nSalise\t:\t%s\n",
                yil, aySayisi, hafta, gun, saat, dakika, saniye, salise);

    }

}

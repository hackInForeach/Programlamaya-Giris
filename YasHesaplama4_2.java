import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class YasHesaplama4_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                           Merhaba, Yaş Hesaplama Programına Hoş Geldin.
                           Sırası ile Yıl, Ay, Gün şeklinde doğum tarihini yazmalısın.
                           örn:
                           1996
                           5
                           9
                           Yaş: 28
                           """);

        LocalDate simdikiZaman = LocalDate.now();
        LocalDate dogumTarihi = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
        long totalGun = Math.abs(ChronoUnit.DAYS.between(dogumTarihi, simdikiZaman));

        long yil = totalGun / 365;
        long kalanGun = totalGun % 365;

        // Ay ve gün sayısını hesaplama
        int aySayisi = 0;
        while (kalanGun > 0) {
            aySayisi++;
            int gunSayisi = LocalDate.of(simdikiZaman.getYear(), aySayisi, 1).lengthOfMonth(); // Ayın gün sayısını al
            if (kalanGun >= gunSayisi) {
                kalanGun -= gunSayisi; // Kalan günlerden ayın gün sayısını çıkar
            } else {
                aySayisi--; // Kalan gün kalmadı, bu ayı sayma
                break;
            }
        }

        long hafta = kalanGun / 7; // Kalan günleri haftaya çevir
        

        System.out.println("\n");
        System.out.printf("Yıl\t:\t%s\nAy\t:\t%s\nHafta\t:\t%s\n\n",
                yil, aySayisi, hafta);


    }

}

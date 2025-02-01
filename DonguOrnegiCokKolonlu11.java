
/**
 *
 * @author Dogukan
 */
public class DonguOrnegiCokKolonlu11 {

    public static void main(String[] args) {

        /*
        4 kolonlu bir array
        1.Kolon: 1-100 arası 15 ile bölünebilen sayılar
        2.Kolon: 1-30 arası 5 ile bölünebilen sayılar
        3.Kolon: 50-100 arası 10 ile bölünebilen sayılar
        4.Kolon: 1-65 arası 2'nin kuvvetleri
        */
        int bolum15 = 0, bolum5 = 0, bolum10 = 0, us2 = 0, usKontrol = 0;

        // 4 satırlı, 9 sütunlu bir dizi tanımlanıyor
        int cokKolon[][] = new int[4][9];
        
        // 0'dan 99'a kadar olan sayıları kontrol eden döngü
        for (int i = 0; i < 100; i++) {
            // 15'e bölünebilen sayılar
            if (i % 15 == 0) {
                bolum15++;
                cokKolon[0][bolum15 - 1] = i;
            }
            // 10'a bölünebilen ve 30'dan küçük sayılar
            if (i % 10 == 0 && i < 30) {
                bolum10++;
                cokKolon[1][bolum10 - 1] = i;
            }
            // 5'e bölünebilen, 50 ile 100 arasındaki sayılar
            if (i % 5 == 0 && i > 50 && i < 100) {
                bolum5++;
                cokKolon[2][bolum5 - 1] = i;
            }
            // 2'nin kuvvetleri olan sayılar
            if (usKontrol < 65) {
                us2++;
                usKontrol = (int) Math.pow(2, us2); // 2'nin kuvvetini hesapla
                cokKolon[3][us2 - 1] = 1<<i;
            }
        }
        
        // Diziye eklenen sayıların toplam sayısını ekrana yazdır
        System.out.printf("\n%d | %d | %d | %d\n",
                bolum15, bolum10, bolum5, us2);

        // Diziyi ekrana yazdıran döngü
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < cokKolon[i].length; j++) {
                // Eğer 0 değilse, ekrana yazdır
                if (cokKolon[i][j] != 0) {
                    System.out.print(cokKolon[i][j] + " ");
                } else {
                    break; // Eğer 0 ile karşılaşılırsa döngüyü kır
                }
            }
            System.out.println(); // Her satır sonunda yeni bir satıra geç
        }
    }
}

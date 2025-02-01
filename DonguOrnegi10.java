
/**
 *
 * @author Dogukan
 */
public class DonguOrnegi10 {

    public static void main(String[] args) {

        // 100 - 0 aralığındaki 13'e bölünebilenleri ekrana yazdıralım
        for (int i = 0; i < 100; i++) {
            if (i % 13 == 0) {
                System.out.println("==>> " + i + " <<==");
            }
        }
    }
}

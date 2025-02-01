/**
 *
 * @author Dogukan
 */
public class DegiskenBastirma2 {
    
    public static void main(String[] args) {
        
        int tamsayi = 1312332;
        short kucukTamSayi = 32535;
        double cokBuyukOndalikliSayi = 12313123123.6546561;
        float buyuOndalikliSayi = 32423443.6F;
        char karakter = 'A';
        String metin = "Bu bir karakter dizisidir.";
        boolean mantiksal = true;
        byte enKucunTamSayi = 127;

        System.out.printf(
                  "byte:\t%d\n"
                + "short:\t%d\n"
                + "int:\t%d\n"
                + "float:\t%f\n"
                + "double:\t%f\n"
                + "char:\t%c\n"
                + "string:\t%s\n"
                + "boolean:%b\n",
                enKucunTamSayi,
                kucukTamSayi,
                tamsayi,
                buyuOndalikliSayi,
                cokBuyukOndalikliSayi,
                karakter,
                metin,
                mantiksal);
        
    }
}

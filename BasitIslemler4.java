import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class BasitIslemler4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Merhaba,\nBiraz sizden alacağımız iki adet sayı ile +,-,*,/ yapıp size göstereceiz");
        System.out.println("İlk sayınızı giriniz: ");
        int number1 = input.nextInt();
        System.out.println("İkinci sayınızı giriniz: ");
        int number2 = input.nextInt();

        int toplam, fark, carpim;
        double bolum, bolum2;

        toplam = number1 + number2;
        fark = number1 - number2;
        carpim = number1 * number2;
        bolum = number1 / (double)number2;
        bolum2 = number2 / (double)number1;

        System.out.println("\n"
                + number1 + " + " + number2 + " = " + toplam + "\n"
                + number1 + " - " + number2 + " = " + fark + "\n"
                + number2 + " - " + number1 + " = " + (fark*-1) + "\n"
                + number1 + " x " + number2 + " = " + carpim + "\n"
                + number1 + " / " + number2 + " = " + bolum + "\n"
                + number2 + " / " + number1 + " = " + bolum2 + "\n");

    }

}

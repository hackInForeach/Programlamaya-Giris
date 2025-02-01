import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class SayiOkuma3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı girin: ");
        int yas = input.nextByte(); //120' den fazla olamayacağını düşünüyorum :)
        System.out.println("Vay canına, bu ne byük bir yaş :D =>> " + yas);

    }
}

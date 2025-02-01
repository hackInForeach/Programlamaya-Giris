
import java.util.Scanner;

/**
 *
 * @author Dogukan
 */
public class IsciProblemleriniCozenKod4_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""
                           İşiçi * süre = iş
                           """);
        System.out.println("Bulmak istediğini aşağı belirt(1,2,3)"
                + "\n1-İşçi sayısı"
                + "\n2-Süre"
                + "\n3-Yapılan iş"
                + "\nİlk bilinmeyenli sonra bilinenli değerleri giri.");
        byte sec = input.nextByte();
        double isci, sure, is;

        switch (sec) {
            case 1:
                System.out.println("İş: ");
                is = input.nextDouble();
                System.out.println("Süre: ");
                sure = input.nextDouble();
                isci = is / sure;
                System.out.printf("\nİşçi: %.0f/%.0f => %2.2f\n", is,sure,isci);
                break;
            case 2:
                System.out.println("İşçi: ");
                isci = input.nextDouble();
                System.out.println("iş: ");
                is = input.nextDouble();
                sure = is / isci;
                System.out.printf("\nSüre: %.0f/%.0f => %2.2f\n",is,isci, sure);
                break;
            case 3:
                System.out.println("İşçi: ");
                isci = input.nextDouble();
                System.out.println("Süre: ");
                sure = input.nextDouble();
                is = isci * sure;
                System.out.printf("\nİş: %.0f*%.0f => %.0f\n",isci,sure, is);
                break;
            default:
                System.out.println("Hatalı bir işlem. Tekrar deneyin.");
                break;
        }

    }
}

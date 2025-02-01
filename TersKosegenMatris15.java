
/**
 *
 * @author Dogukan
 */
public class TersKosegenMatris15 {

    public static void main(String[] args) {

        int matris[][] = new int[5][5];

        for (int i = 0; i < matris.length; i++) {
            matris[i][matris.length - i - 1] = i + 1;
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

    }

}

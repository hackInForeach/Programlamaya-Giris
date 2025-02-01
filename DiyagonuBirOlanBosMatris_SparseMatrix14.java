
/**
 *
 * @author Dogukan
 */
public class DiyagonuBirOlanBosMatris_SparseMatrix14 {

    public static void main(String[] args) {

        int matris[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            matris[i][i] = 1;
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

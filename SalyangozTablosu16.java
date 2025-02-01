
/**
 *
 * @author Dogukan
 */
public class SalyangozTablosu16 {

    public static void main(String[] args) {

        System.out.println("""
                           1  2  3  4  5
                           16 17 18 19 6
                           15 24 25 20 7
                           14 23 22 21 8
                           13 12 11 10 9
                           """);

        int n = 5; // Matris boyutu
        int[][] salyangozMatris = new int[n][n];

        int[] xEkseni = {0, 1, 0, -1};
        int[] yEkseni = {1, 0, -1, 0};

        int yon = 0;

        int x = 0, y = 0, sayi = 1, nx, ny;

        for (int i = 0; i < n * n; i++) {
            salyangozMatris[x][y] = sayi++;

            nx = x + xEkseni[yon];
            ny = y + yEkseni[yon];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || salyangozMatris[nx][ny] != 0) {
                yon = (yon + 1) % 4;
                nx = x + xEkseni[yon];
                ny = y + yEkseni[yon];

            }
            x = nx;
            y = ny;

        }
        for (int[] satir : salyangozMatris) {
            for (int s : satir) {
                System.out.printf("%2d ", s);
            }
            System.out.println();
        }

    }
}

import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int N = 10;
        int[][] A = new int[N][N];
        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = rand.nextInt(91) - 30;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (i > j) {
                    if (A[i][j] < min) {
                        min = A[i][j];
                    }
                }
            }
        }
        System.out.println("Мінімальне значення нижче головної діагоналі = " + min);
    }
}

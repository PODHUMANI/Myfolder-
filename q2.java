import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int R = scanner.nextInt();

        int C = scanner.nextInt();


        int[][] mat = new int[R][C];


        for (int i = 0; i < R; i++) {

            for (int j = 0; j < C; j++) {

                mat[i][j] = scanner.nextInt();

            }

        }


        int previous = 0;

        int ans = 0;


        for (int i = 0; i < R; i++) {

            int current = 0;

            for (int j = 0; j < C; j++) {

                if (mat[i][j] == 1) {

                    current++;

                }

            }

            if (current > previous) {

                previous = current;

                ans = i + 1;

            }

        }


        System.out.println(ans);

        scanner.close();

    }

}

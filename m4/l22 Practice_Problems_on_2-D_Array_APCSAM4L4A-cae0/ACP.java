public class ACP {
    public static void main(String[] args) {
        int[][] a = {
            {3, 1, 4},
            {2, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < a.length; i++) {
            int min = a[i][0], col = 0;

            for (int j = 1; j < a[i].length; j++)
                if (a[i][j] < min) {
                    min = a[i][j];
                    col = j;
                }

            boolean saddle = true;

            for (int j = 0; j < a.length; j++)
                if (a[j][col] > min)
                    saddle = false;

            if (saddle)
                System.out.println("Saddle Point: " + min);
        }
    }
}
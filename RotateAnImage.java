public class RotateAnImage {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8, },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        print2dMatrix(arr);
        rotateby90(arr);
    }

    public static void print2dMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateby90(int[][] arr) {
        // take transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                // swap a[i][j] to a[j][i];
                // int temp = arr[i][j];
                // arr[i][j] = arr[j][i];
                // arr[j][i] = temp;
                // X = X + Y = 25 +23 = 48
                // Y = X - Y = 48 - 23 = 25
                // X = X -Y = 48 - 25 = 23
                arr[i][j] = arr[i][j] + arr[j][i];
                arr[j][i] = arr[i][j] - arr[j][i];
                arr[i][j] = arr[i][j] - arr[j][i];
            }
        }
        // swap the columns
        int left = 0, right = arr[0].length - 1;
        while (left < right) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }
        print2dMatrix(arr);
    }
}

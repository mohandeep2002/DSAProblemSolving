public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 } };
        spiralMatrix(arr);
    }

    public static void spiralMatrix(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        int rmin = 0, rmax = arr.length - 1;
        int cmin = 0, cmax = arr[0].length - 1;
        int count = 0;
        while (count < n * m) {
            // top boundary
            for (int col = cmin; col <= cmax && count < n * m; col++) {
                System.out.print(arr[rmin][col]);
                System.out.print(" ");
                count++;
            }
            rmin++;
            // right boundary
            for (int row = rmin; row <= rmax && count < n * m; row++) {
                System.out.print(arr[row][cmax]);
                System.out.print(" ");
                count++;
            }
            cmax--;
            // bottom boundary
            for (int col = cmax; col >= cmin && count < n * m; col--) {
                System.out.print(arr[rmax][col]);
                System.out.print(" ");
                count++;
            }
            rmax--;
            // left boundary
            for (int row = rmax; row >= rmin && count < n * m; row--) {
                System.out.print(arr[row][cmin]);
                System.out.print(" ");
                count++;
            }
            cmin++;
        }
    }
}


import java.util.*;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input");
        int n = scn.nextInt();
        System.out.println(solution(n));
        scn.close();
    }

    public static int solution(int n) {
        String ans = "";
        for (int div = 9; div >= 2; div--) {
            while (n % div == 0) {
                n = n / div;
                ans = div + ans;
            }
        }
        if (n != 1)
            return -1;
        return Integer.parseInt(ans);
    }
}

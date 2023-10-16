
public class MajorityElement {
    public static void main(String[] args) {
        // int[] arr = { 2, 2, 6, 6, 6, 2, 2, 8, 2, 2 };
        int[] arr = { 4, 4, 3, 4, 7, 3, 4, 4, 7, 4, 4, 7, 4, 4 };
        System.out.println(findMajorityElement(arr, arr.length));
    }

    public static int findMajorityElement(int[] arr, int n) {
        int candidate = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        // we should verify if candidate is answer or not
        count = 0;
        for (int val : arr) {
            if (val == candidate) {
                count++;
            }
        }
        if (count > n / 2)
            return candidate;
        return -1;
    }
}
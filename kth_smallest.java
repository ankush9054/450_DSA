import java.util.Arrays;

public class kth_smallest {

    static int k_small(int arr[], int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 8, 1, 7, 5 };
        System.out.print(k_small(arr, 3));
    }

}

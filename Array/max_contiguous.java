public class max_contiguous {
    static int sum(int arr[]) {
        int curr_max = arr[0];
        int prev_max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr_max = Math.max(arr[i], curr_max + arr[i]);
            prev_max = Math.max(prev_max, curr_max);
        }
        return prev_max;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 4, -9, 4, -6, -8 };
        System.out.print(sum(arr));

    }

}

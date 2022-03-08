public class move_neg {
    static void neg(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (arr[low] < 0) {
                low++;
            } else if (arr[low] > 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, 43, 56, -4, 21, -6 };
        neg(arr);
    }

}

public class max_min_arr {

    static int max(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;

    }

    static int min(int arr[]) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        return min;

    }

    public static void main(String[] args) {

        int arr[] = { 32, 54, 35, 47, 12, 53 };
        System.out.println(max(arr));
        System.out.println(min(arr));

    }

}

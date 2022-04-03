public class inter_union {

    static void intersection(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }

    static void union(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr1[i] + arr2[j]);
            }
        }
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int arr2[] = { 5, 6, 7, 8, 9, 0, 21 };
        intersection(arr1, arr2);
        union(arr1, arr2);

    }

}

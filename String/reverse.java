public class reverse {

    static void reverse_string(String str) {
        int low = 0;
        int high = str.length() - 1;

        char c[] = str.toCharArray();
        while (low < high) {

            char temp = c[low];
            c[low] = c[high];
            c[high] = temp;
            low++;
            high--;
        }
        System.out.print(c);
    }

    public static void main(String[] args) {

        String str = "Aeroplane";
        reverse_string(str);

    }

}

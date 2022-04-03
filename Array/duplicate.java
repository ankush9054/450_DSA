import java.util.*;

public class duplicate {
    static int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                return nums[i];
            }
            hs.add(nums[i]);
        }
        return 0;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 3, 4, 2, 2 };
        System.out.print(findDuplicate(nums));

    }

}

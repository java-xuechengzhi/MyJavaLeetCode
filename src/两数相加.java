import java.util.HashMap;
import java.util.Map;

public class 两数相加 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
        }
        throw new IllegalArgumentException();
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 3, 4};
        int target = 4;
        int[] ans = new int[2];
        ans = twoSum(arr, target);
        for(int a : ans) {
            System.out.print(a + " ");
        }

    }
}

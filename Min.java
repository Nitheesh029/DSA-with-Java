public class Min {
    public static void main(String[] args) {
        int[] nums = {10, 20, 4,3 , 100, 50};
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(min);
    }
}

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] nums = {10, 20, 4,3 , 100, 50};
        reverse(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void reverse(int[] arr, int start, int end){
        int temp;
        while(start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
        }

    }
}

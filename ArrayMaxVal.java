import java.util.Scanner;

public class ArrayMaxVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = sc.nextInt();
        }
        MaxValue(nums);
    }

    static void MaxValue(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println("The maximum value in the array is:"+max);
    }
}

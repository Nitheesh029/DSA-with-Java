import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols] = sc.nextInt();
            }
        }
//        for (int rows = 0; rows < arr.length; rows++) {
//            for (int cols = 0; cols < arr[rows].length; cols++) {
//                System.out.print(arr[rows][cols]+ " ");
//            }
//            System.out.println();
//        }
        for (int rows = 0; rows < arr.length; rows++) {
            System.out.println(Arrays.toString(arr[rows]));
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int arr[] =new int[5];
//        arr[0] = 23;
//        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 values in array");
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];// for printing the sum of all arrays
        }
        System.out.println("sum of all the values in array is : "+ sum);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);



       }
    }
}



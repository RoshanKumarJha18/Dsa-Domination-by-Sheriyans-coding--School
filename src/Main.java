import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for n ");
        int n = sc.nextInt();
        //outer loop
        for (int i = 1; i <= n ; i++) {
            //inner loop
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();

        int j = 0;
        for ( int i=0;i<=n;i++){
            System.out.println("for loop printed");
        }
        while (j<n){
            System.out.println("while loop printed");
            j++;
        }

    }
}

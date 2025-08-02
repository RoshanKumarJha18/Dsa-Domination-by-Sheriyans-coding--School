import java.util.Scanner;

public class ControlFlowStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age :");
        int age = sc.nextInt();
        if (age>18) {
            System.out.println("Your Eligible For Voting");
        } else if (age == 0) {
            System.out.println("Your credential are invalid");

        } else {
            System.out.println("Your not eligible For voting");
        }
        if (age == 18){
            System.out.println("Apply For vote id");
        }
    }
}

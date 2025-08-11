import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your amount");
        int amount = sc.nextInt();
        int dis = 0;
        if (amount >= 0 && amount<=1000) dis =0;
        else if (amount >=1000 && amount<=5000) dis=5;
        else if(amount>=5000 && amount<=9000) dis=10;
        else dis=20;
        System.out.println(amount-(dis*amount)/100);
    }
}

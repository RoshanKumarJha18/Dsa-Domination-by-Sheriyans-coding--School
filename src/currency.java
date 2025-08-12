import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount");
        int amount = sc.nextInt();//1200

        if (amount>=500){
            System.out.println("500 Notes - " + amount/500);
            amount = amount%500;
        }if (amount>=200){
            System.out.println("200 Notes -" + amount/200);
            amount = amount%200;
        }if (amount>=100){
            System.out.println("100 Notes - " + amount/100);
            amount = amount%100;
        }if (amount>=50){
            System.out.println("50 Notes -" + amount/50);
            amount = amount%50;
        }if (amount>=20){
            System.out.println("20 Notes -" + amount/20);
            amount = amount%20;

        }
        if (amount>=10){
            System.out.println("10 Notes -" + amount/10);
            amount = amount%10;

        }if (amount>=5){
            System.out.println("5 Notes -" + amount/5);
            amount = amount%5;

        }if (amount>=2){
            System.out.println("2 Notes -" + amount/2);
            amount = amount%2;

        }if (amount>=1){
            System.out.println("1 Notes -" + amount/1);
            amount = amount%1;

        }


    }
}

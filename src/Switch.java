import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
         int n = sc.nextInt();
        switch (n) {
            case 1 ->{ // u can also write case 1 :{need to keep break; when written like this}
                System.out.println("case 1 has been printed");
            }
            case 2 ->{
                System.out.println("case 2 has been printed");
            }
            case 3 ->{
                System.out.println("case 3 has been printed");
            }
            case 4 ->{
                System.out.println("case 4 has been printed");
            }
            default -> {
                System.out.println("default case has been printed");
            }
        }
    }
}

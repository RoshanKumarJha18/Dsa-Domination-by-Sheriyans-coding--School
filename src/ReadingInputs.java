import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // this is how to take inputs from the users
        System.out.println("enter your age");
        int age = sc.nextInt();

        sc.nextLine(); // this line is a dummy line written when before the sc.nextline() to print all values

        System.out.println("enter your name");
        String name = sc.nextLine(); // for taking value of String we use nextLine()

        System.out.println("your age is " + age + " name is " + name);

        System.out.println("enter the char");
        char ch = sc.nextLine().charAt(0); // for taking input as charector we use .charAt but take input as string and change the value of CharAt(i) where i is the index position
        System.out.println("Your char is " + ch);
    }
}

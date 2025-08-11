import java.util.Scanner;
public class age {

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            sc.nextLine();
            String Name = sc.nextLine();
            if(age>=18){
                System.out.println(Name + " is a valid voter");
            }
            else{
                System.out.println( Name + " is not a valid voter");
            }
        }

}


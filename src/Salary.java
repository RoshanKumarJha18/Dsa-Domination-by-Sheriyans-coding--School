import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the gender.");
        char gender = sc.next().charAt(0);// f
        System.out.println("enter the year of experience.");
        int experience = sc.nextInt();//12
        System.out.println("enter g for graduate and p for post graduate.");
        char qualification = sc.next().charAt(0);//p
        int salary;
        if (gender == 'f' || gender=='F'){
            if (experience >= 10 && (qualification == 'p'|| qualification == 'P')){
                salary=12000;
                System.out.println(salary);
            }else if (experience >= 10 && (qualification == 'g' || qualification == 'G')){
                salary=9000;
                System.out.println(salary);
            }
            else if (experience<10 && (qualification == 'p'|| qualification == 'P') ){
                salary=10000;
                System.out.println(salary);
            }
            else if (experience<10 && (qualification == 'g'|| qualification == 'G')){
                salary=6000;
                System.out.println(salary);
            }
        }
       else if (gender == 'm' || gender=='M'){
            if (experience >= 10 && (qualification == 'p'|| qualification == 'P')){
                salary=15000;
                System.out.println(salary);
            }else if (experience >= 10 && (qualification == 'g' || qualification == 'G')){
                salary=10000;
                System.out.println(salary);
            }
            else if (experience<10 && (qualification == 'p'|| qualification == 'P') ){
                salary=10000;
                System.out.println(salary);
            }
            else if (experience<10 && (qualification == 'g'|| qualification == 'G')){
                salary=7000;
                System.out.println(salary);
            }
        }else System.out.println("Invalid gender");
    }
}

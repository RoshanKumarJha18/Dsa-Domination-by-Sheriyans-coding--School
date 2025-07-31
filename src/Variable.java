public class Variable {
    public static void main(String[] args) {
        int a = 10; //declaration and initialization
        int b = 30;  // int + int = int
       int c = a + b ;
        System.out.println(c);

        String s1 = "hello";  //String + String = String (concatenation)
        String s2 = " world";
        String s3 = s1 + s2 ;
        System.out.println(s3);

        String s4 = "Roshan"; //String + int = String (concatenation)
        int d = 10;
        String s5 = s4 + d ;
        System.out.println(s5);

        String s6 = "print a and b "; //firstly string + int = string again string +int =String (concatenation)
        int e = 10;
        int f = 40;
        System.out.println(s6 + e + f);

        String s7 = "print a and b "; // using bodmas first in bracket then which is int + int = int then String +int = String
        int g = 10;
        int h = 40;
        System.out.println(s7 + (g + h));
    }
}

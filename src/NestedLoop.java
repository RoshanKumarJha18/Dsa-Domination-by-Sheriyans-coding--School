public class NestedLoop {
    public static void main(String[] args) {
        //print pattern using nested loop
        /*
            * * * *
            * * * *
            * * * *
            * * * *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}

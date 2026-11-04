package Pattern_Striver_AtoZ;

public class Pattern_1 {
    public static void main(String [] args) {
       System.out.println("Pattern 1: ");
       pattern_2(4);
    }

    static void pattern_1(int n) {
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n ) {
        for (int i = 0; i < n; i++) {
           for(int j = 0; j <= i; j++){
               System.out.print("* ");
           }
           System.out.println();
        }
    }
}

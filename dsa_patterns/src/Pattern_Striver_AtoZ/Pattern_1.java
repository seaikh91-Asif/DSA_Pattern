package Pattern_Striver_AtoZ;

public class Pattern_1 {
    public static void main(String [] args) {
       System.out.println("Pattern 1: ");
       pattern_4(5);
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

    static void pattern_3(int n ){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern_4(int n ){
        for(int i = 1; i <=n; i++){ // n = 3; i = 1; i <= 3 : ture;
            for(int j = 1; j <= i; j++){ // j = 1; j <= i = 1: ture:
                System.out.print(i + " "); // print 1
            }
            System.out.println();
        }
    }
}

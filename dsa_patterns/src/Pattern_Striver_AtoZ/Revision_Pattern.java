package Pattern_Striver_AtoZ;

public class Revision_Pattern {
    static void pattern_1(int n){
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern_4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern_5(int n){
        for( int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_6(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern_7(int n ){
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j <= n - i - 1; j++){
                System.out.print(" ");
            }

            //stars
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print('*');
            }

            //space
            for(int j = 0; j <= n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern_8(int n){
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < i; j++){
                System.out.print(' ');
            }
            //
            for(int j = 0; j < 2*n - 2*i - 1; j++){
                System.out.print('*');
            }
            //space
            for(int j = 0; j < i; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    static void pattern_9(int n){
        pattern_7(n);
        pattern_8(n);
    }
    public static void main(String[] args){
        System.out.println("Pattern ");
        pattern_9(5);
    }
}

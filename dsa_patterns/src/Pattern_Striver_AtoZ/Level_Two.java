package Pattern_Striver_AtoZ;

public class Level_Two {
    static void pattern_7(int n) {
        for(int i = 0; i < n; i++){
            // space
            for(int j = 0; j < n - i - 1; j++ ){
                System.out.print(" ");
            }
            //Stars
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            // space
            for(int j = 0; j < n - i - 1; j++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern_8(int n ) {
        for(int i = 0; i < n; i++){
            // spacing
            for(int j =0 ; j < i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 0; j < 2*n - (2*i + 1)  ; j++){
                System.out.print("*");
            }
            // spacing
            for(int j =0 ; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern_9(int n) {
        pattern_7(n);
        pattern_8(n);
    }

    static void pattern_10(int n){
        for (int i = 1; i <= 2 * n - 1; i++){
            int stars = i;
            if(i > n) {
                stars = 2 * n - i;
            }
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_11(int n){
        int stars = 1;
        for(int i = 0; i < n; i++){
            if(i %2 == 0){
                stars = 1;
            } else {
                stars = 0;
            }
            for(int j = 1; j <= i; j++){
                System.out.print(stars);
                stars = 1 - stars;
            }
            System.out.println();
        }
    }

    static void pattern_12(int n) {
        int space  = 2 * (n -1);
        for( int i = 1; i <= n; i++){
            //numbers
            for( int j = 1; j <= i; j++){
                System.out.print(j);
            }
            //space
            for(int j = 1; j<= space; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j =i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    static void pattern_13(int n){
        int number = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print(" " + number);
                number++;
            }
            System.out.println();
        }
    }

    static void pattern_14(int n){
        for(int i = 0; i < n; i++){
            for(char ch = 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern_15(int n){
        for(int i = 0; i < n; i++){
            for(char ch = 'A'; ch <= 'A' + (n - i - 1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern_16(int n){
        for(int i = 0; i < n; i++){
            char ch = (char) ('A' + i);
            for(int j = 0; j <= i; j++){
                System.out.print( ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern_17(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint =  ( 2 * i + 1) /2;
            for(int j = 1; j <= 2 * i + 1; j++){
                System.out.println(ch);
                if(j <= breakpoint) {
                    ch++;
                } else{
                    ch--;
                }
            }

            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    static void pattern_18(int n){
        for(int i = 0; i < n; i++){
            for(char ch = (char) ('E' - i); ch <= 'E'; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_18(5);
    }
 }

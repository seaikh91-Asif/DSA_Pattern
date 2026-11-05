package Pattern_Striver_AtoZ;

public class Level_Two {
    public static void main(String[] args){
        pattern_9(5);
    }

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
 }

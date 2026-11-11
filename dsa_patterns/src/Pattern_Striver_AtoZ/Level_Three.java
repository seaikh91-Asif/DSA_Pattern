package Pattern_Striver_AtoZ;

public class Level_Three {
/*
Pattern: 19
            * * * * * * * * * *
            * * * *     * * * *
            * * *         * * *
            * *             * *
            *                 *
            *                 *
            * *             * *
            * * *         * * *
            * * * *     * * * *
            * * * * * * * * * *
 */
    static void pattern_19(int n){
        //First Half:
        int initSpace = 0;
        for(int i = 0; i < n; i++){
            // Stars:
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            //Space:

            for(int j = 1; j <= initSpace; j++){
                System.out.print(" ");
            }
            //Stars:
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            System.out.println();
            initSpace += 2;
        }
        //Second Half:
        initSpace = 2*n - 2;
        for(int i = 1; i <= n; i++){
            //Stars:
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //Space:
            for(int j = 1; j <= initSpace; j++){
                System.out.print(" ");
            }
            //Stars:
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
            initSpace -= 2;
        }
    }

    /*
    Pattern: 21
        * * * * *
        *       *
        *       *
        *       *
        * * * * *
    */
    static void pattern_21(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n - 1|| j == n - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern_21(5);
    }
}

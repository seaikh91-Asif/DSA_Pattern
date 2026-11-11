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
    public static void main(String[] args){
        pattern_19(5);
    }
}

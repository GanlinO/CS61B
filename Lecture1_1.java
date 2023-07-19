public class Lecture1_1 {

    // 1b
    public static void drawTriangle(int N){
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void windowPosSum(int[] a, int n){
        for (int i = 0; i < a.length; i++){
            if (a[i] <= 0)
                continue;

            for (int j = 1; j <= n; j++){
                if (i + j > a.length - 1)
                    break;

                a[i] += a[i + j];
                
            }

        }
    }

    // Exercise 2
    public static int max(int[] m){
        int max = 0;
        for (int element: m){
            if (element > max)
                max = element;
        }
        return max;
    }
    public static void main(String[] args) {
        /*
         * HW0
         * 
         * Conditionals
         * switch (month) {
         * case 2:
         *   days = 28;
         *   break;
         * case 4:
         * case 6:
         * case 9:
         * case 11:
         *   days = 30;
         *   break;
         * default:
         *   days = 31;
         *   break;
         * }
         * 
         * // Equivalently
         * 
         * if (month == 2) {
         *   days = 28;
         * } else if ((month == 4) || (month == 6) ||
         *            (month == 9) || (month == 11)) {
         *   days = 30;
         * } else {
         *   days = 31;
         * }
         * 
         * 
         * if (x < 10)
         *     x = x + 10;
         */

        // 1a
        // for (int i = 1; i <= 5; i++){
        //     for (int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // drawTriangle(10);

        // int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        // System.out.println(max(numbers));

        // for (int i = 0, j = 10; i < j; i += 1, j -= 1) {
        //     System.out.println(i + " " + j);
        // }

        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        System.out.println(java.util.Arrays.toString(a));
    }
}
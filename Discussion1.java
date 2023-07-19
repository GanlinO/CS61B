import java.util.Arrays;

public class Discussion1 {
    public static void main(String[] args) {
        // int[] array1 = { 3, 0, 4, 6, 3, 1, 5 };
        // System.out.println(mystery(array1, 2));

        // int[] inputArray = {3, 0, 4, 6, 3};
        // mystery2(inputArray);
        // System.out.println(Arrays.toString(inputArray));

        System.out.println(fib2(8, 0, 1));
    }

    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;
    }

    public static void mystery2(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            int targetIndex = mystery(inputArray, index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
        }
    }

    public static void fibPrint(int n){
        if (n == 1){
            System.out.println(0);
        } else {
            System.out.print("0 1");

            if (n >= 3){
                int first = 0;
                int second = 1;
                int third;

                while (n - 2 > 0){
                    third = first + second;
                    System.out.print(" " + third);
                    first = second;
                    second = third;
                    n--;
                }

                System.out.println();
            }
        }
    }

    public static int fib2(int n, int f0, int f1) {
        if (n == 1 || n == 2){
            return (n - 1) * f1 + -1 * (n - 2)* f0;
        } else {
            return fib2(n - 1, f0, f1) + fib2(n - 2, f0, f1);
        }   
    }
}
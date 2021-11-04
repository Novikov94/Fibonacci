import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = scanner.nextInt();
        fibonacci(n,true);
    }

    public static int[] fibonacci(int N, boolean flag) {
        int[] arr = new int[N];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        if (flag) {
            for (int j : arr) {
                System.out.println(j);
            }
        } if (!flag){
            for (int i = arr.length -1 ; i > -1; i--) {
                System.out.println(arr[i]);
            }
            }
        return arr;
    }
}

import java.util.Scanner;

public class SumArrayElementsStartToMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        calculateSum(arr);
       
    }

    public static void calculateSum(int[] arr) {
        int sum = 0;
       for(int i=0; i<arr.length/2; i++){
        sum += arr[i];
       }
       System.out.println(sum);
    }
}
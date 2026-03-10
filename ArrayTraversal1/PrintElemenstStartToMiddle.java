import java.util.Scanner;

public class PrintElementsStartToMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printStartToMiddle(arr);
    }

    public static void printStartToMiddle(int[] arr) {
       for(int i=0; i<arr.length/2; i++){
        System.out.print(arr[i] + " ");
       }
    }
}
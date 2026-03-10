import java.util.Scanner;

public class PrintOddNumberElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i <arr.length; i++){
            arr[i] = sc.nextInt();
        }       
        printOddNumberElements(arr);
    }

    public static void printOddNumberElements(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
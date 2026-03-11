import java.util.Scanner;

public class ProductArrayElementsMiddleToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
         calculateProduct(arr);
        
    }

    public static void calculateProduct(int[] arr) {
       int product = 1;
       for(int i=arr.length/2; i<arr.length; i++){
        product *= arr[i];
       }
       System.out.println(product);
    }
}
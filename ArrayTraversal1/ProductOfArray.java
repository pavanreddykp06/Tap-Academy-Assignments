import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        calculateProduct(arr);
       
    }

    public static void calculateProduct(int[] arr) {
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
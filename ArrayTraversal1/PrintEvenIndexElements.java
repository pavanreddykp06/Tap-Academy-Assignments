import java.util.Scanner;

class PrintEvenIndexElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printEvenIndexArrayElements(arr);
    }

    public static void printEvenIndexArrayElements(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
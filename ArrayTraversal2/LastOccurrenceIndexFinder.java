import java.util.Scanner;

public class LastOccurrenceIndexFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        
        int result = lastOccurrence(arr,k);
        System.out.println(result);
        
    }

    public static int lastOccurrence(int[] arr,int k){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}
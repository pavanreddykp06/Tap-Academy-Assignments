import java.util.Scanner;

public class OccurrenceOfLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int largest = largestElement(arr);
        int occurrence = largestOccurrence(largest,arr);
        System.out.println(occurrence);
    }

    public static int largestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int largestOccurrence(int largest, int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(largest == arr[i]){
                count++;
            }
        }
        return count;
    }
}
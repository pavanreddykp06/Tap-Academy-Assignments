import java.util.Scanner;
public class OccurrenceOfSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min = smallestElement(arr);
        int occurrence = smallestOccurrence(arr,min);
        System.out.println(occurrence);
    }

    public static int smallestElement(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int smallestOccurrence(int[] arr, int min){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(min == arr[i]){
                count++;
            }
        }
        return count;
    }
}
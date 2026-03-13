import java.util.Scanner;
public class OddElementsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
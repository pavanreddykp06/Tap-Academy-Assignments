import java.util.Scanner;

public class SmallestElement {
    static void smallestNumber(int[] ar)
    {
    	int min = Integer.MAX_VALUE;
        for(int i=0; i<ar.length; i++){
            if(ar[i] < min){
                min = ar[i];
            }
        }
        System.out.print(min);
    }
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		smallestNumber(ar);
	}
    
}
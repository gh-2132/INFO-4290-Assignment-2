import java.util.Scanner;

public class SortableArray {
	
	public static int[] getUserInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " numbers: ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
}
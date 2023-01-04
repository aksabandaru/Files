
package oops;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		System.out.println("enter the size of array");//5
		Scanner scanObj=new Scanner(System.in);
		int size=scanObj.nextInt();
		System.out.println("enter elements to stre in array");//45 67 89 43 55
		int arr[] = new int [size];
		for (int ctr = 0; ctr < size; ctr++) {
			arr[ctr] = scanObj.nextInt();
		}
		for(int ctr = size-1;ctr>=0;ctr--) {//55 43 89 67 45
			System.out.print(arr[ctr]+" ");
		}
		
	}

}

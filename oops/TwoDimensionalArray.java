package oops;
import java.util.Scanner;


public class TwoDimensionalArray {
	static void togiveinputnumers(int arr[][],Scanner obj) {
		//System.out.println("enter rows values");
		while(ctr<arr.length) {
			System.out.println("enter rows values");

			int ctr1=0;
			while(ctr1<arr[ctr].length) {
				System.out.println("enter cols values");


			arr[ctr][ctr1]=obj.nextInt();
			//System.out.println("enter rows values");

			
		ctr1++;
					}
			ctr++;
		}
	}

	public static void main(String[] args) {
	final Scanner	scanObj=new Scanner(System.in);
	System.out.println("enter no of rows");
	int row = scanObj.nextInt();
	System.out.println("enter no of cols");
	int col = scanObj.nextInt();
	int arr[][]=new int[row][col];
	togiveinputnumers(arr,scanObj);
	int ctr=0;
	while(ctr<arr.length) {
		System.out.println("enter rows values");

		int ctr1=0;
		while(ctr1<arr[ctr].length) {
		System.out.print(arr[ctr][ctr1]+" ");
		
	ctr1++;
		}
		System.out.println();
		ctr++;
	}

}
}

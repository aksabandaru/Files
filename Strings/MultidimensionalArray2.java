package Strings;

import java.util.Scanner;


public class MultidimensionalArray2 {
	static void displaydetails(int arr[][]) {
					for(int ctr=0;ctr<arr.length;ctr++) {
				for(int ctr1=0;ctr1<arr[ctr].length;ctr1++) {
									System.out.print(arr[ctr][ctr1]+" ");
						                                                           
				
	}
				System.out.println();
					}
	}
	static void acceptinuput(int arr[][],Scanner scanObj) {
		for(int ctr=0;ctr<arr.length;ctr++) {
			for(int ctr1=0;ctr1<arr[ctr].length;ctr1++) {
				arr[ctr][ctr1]=scanObj.nextInt();
			}
		}
	}

	public static void main(String[] args) {
	System.out.println("enter no of rows");
	Scanner scanObj = new Scanner(System.in);
	int rows = scanObj.nextInt();
	int arr[][]=new int[rows][];
	for(int ctr=0;ctr<rows;ctr++) {
	int cols = scanObj.nextInt();
	arr[rows]=new int[cols];	
	acceptinuput(arr,scanObj);
	displaydetails(arr);


	}
	}
}



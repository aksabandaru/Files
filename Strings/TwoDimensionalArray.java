package Strings;

import java.util.Scanner;

public class TwoDimensionalArray {
	static int[][] gettingleftdigonalzero(int arr[][]) {
		for(int ctr=0;ctr<arr.length;ctr++) {
			for(int ctr1=0;ctr1<arr[ctr].length;ctr1++) {
				if(ctr+ctr1==arr.length-1) {
					arr[ctr][ctr1]=0;
					break;
				}
			}
		}
			return arr;
		
		
			

		}


	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		try {
			System.out.println("enter no of rows ");
			short rows = scanObj.nextShort();
			System.out.println("enter no of rows");
			short cols = scanObj.nextShort();
			if(rows==cols) {
				int arr[][]= new int[rows][cols];
				MultidimensionalArray2.acceptinuput(arr,scanObj);
				MultidimensionalArray2.displaydetails(arr);
				System.out.println("==================");
				int values[][]=gettingleftdigonalzero(arr);
				MultidimensionalArray2.displaydetails(arr);
				

			}
			else {
				System.out.println("enter equal number of rows and cols");
			}
		}
		catch(Exception obj) {
			System.out.println(obj);

		}
	}
}



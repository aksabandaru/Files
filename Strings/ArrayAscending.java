package Strings;

import java.util.Scanner;

public class ArrayAscending {
	static void acceptnumber(int arr[],Scanner Obj) {
		for(int ctr=0;ctr<arr.length;ctr++) {
			arr[ctr]=Obj.nextInt();
		}
	}
	static void ascendindorder(int arr[]) {
		for(int ctr=0;ctr<arr.length;ctr++) {//25 10 23 7 45 67       7 10 23 25 45 67
			for(int ctr1=ctr+1;ctr1<arr.length;ctr1++) {
				int save=arr[ctr];
				if(arr[ctr]>arr[ctr1]) {
					arr[ctr]=arr[ctr1];
					arr[ctr1]=save;
				}

			}}
		displaynumbers(arr);

		
		}
		
		static void displaynumbers(int arr[]) {
			for(int value:arr) {
			System.out.println(value);
			}

		
	}

	public static void main(String[] args) {
		Scanner scanObj=new Scanner (System.in);
		System.out.println("enter size of array");
		int size = scanObj.nextInt();
		int arr[] = new int[size];
		acceptnumber(arr,scanObj);
		ascendindorder(arr);


	}

}

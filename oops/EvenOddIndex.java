package oops;
import java.util.Scanner;

public class EvenOddIndex {

	public static void main(String[] args) {
		System.out.println("enter the no of elements");//6
		Scanner scanObj=new Scanner(System.in);
		int size=scanObj.nextInt();
		System.out.println("enter the elements");//3,5,4,67,89,90
		int arr[]=new int[size];
		for(int ctr = 0; ctr<size;ctr++) {
		arr[ctr]=scanObj.nextInt();
		}
		System.out.println("zero'th index "+arr[0]);//3

		for(int ctr = 1; ctr<size;ctr++) {
		
		if( ctr % 2 == 0) {
			System.out.println("even index value"+" "+ arr[ctr]);//4,89
		}
		else {
			System.out.println("odd index value"+" "+ arr[ctr]);//5,67,90
		}
		}
	


}
}

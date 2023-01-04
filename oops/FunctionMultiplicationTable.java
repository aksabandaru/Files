package oops;
import java.util.Scanner;

public class FunctionMultiplicationTable {
	void Multiplication(int number) {
		//int limit= 10;
		for(int ctr=1 ;ctr<=number;ctr++) {
			System.out.println(number+"*"+ctr+"="+(number*ctr));
			
		}
	}

	public static void main(String[] args) {
		Scanner scanObj =new Scanner(System.in);
		System.out.println("enter a number");
		int number = scanObj.nextInt();
		int limit = scanObj.nextInt();
		System.out.println("enter the limit");
		FunctionMultiplicationTable obj = new FunctionMultiplicationTable();
		obj.Multiplication(number);
	
		//for(int ctr=1 ;ctr<=limit;ctr++) {
		//System.out.println(number+"*"+ctr+"="+(number*ctr));
		
	}
		
	

}


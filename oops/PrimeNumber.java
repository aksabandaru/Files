package oops;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanobj= new Scanner(System.in);
		System.out.println("enter a number to ceck it is prime or not");
		//67
		int userInput=scanobj.nextInt();
		boolean flag=true;
		for(int ctr=2;ctr<userInput;ctr++) {
			if(userInput%ctr==0) {
				flag=false;
				System.out.println(userInput+" is not a prime number");
				break;
			}
		}
	
	
		if(flag==true) {
			System.out.println(userInput+" is prime number");
		}
		

	}

}



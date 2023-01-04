package oops;
import java.util.Scanner;
 class SpyNumber {

	public static void main(String[] args) {
		Scanner scanobj = new Scanner(System.in);
		System.out.println("enter a number to check it is spy number or not");
		//1241
		int userInput=scanobj.nextInt();
		int rem,sum=0,product=1;
		int temp=userInput;
		
	while(userInput!=0) {//1241 124 12 1
		rem=userInput%10;//1 4 2 1
		sum+=rem;//1 5 7  8
		product*=rem;//1 4 8 8
		userInput=userInput/10;
	}
	if(sum==product) {
		System.out.println(temp+" is spy number");
	}
	else 
	{
		System.out.println(temp+" is not a spy number");
		
	}

}
 }

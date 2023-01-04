package Strings;
import java.util.Scanner;

public class NeonNumber {

	static int tofindSquarenumber(int number ) {//10
		return number*number;//100
		
	}
	 static int toseperatenumberanddosum(int number) {//100
	   		int sum=0;
	   		for(;number!=0;) {//100 10 1
	   			sum+=number%10;//0 0 1
	   		number/=10;//10  1 0
	   		}
	   		return sum;//1
	 }

	public static void main(String[] args) {
		Scanner scanObj =new Scanner(System.in);
		System.out.println("enter a number");//10
		int usernumber = scanObj.nextInt();
		int squrenumber=tofindSquarenumber(usernumber);//call function
       int wholesum= toseperatenumberanddosum(squrenumber);//call function
       if(wholesum==usernumber) {//10==1 (false)
    	   System.out.println("neon number");
       }
       else {
    	   System.out.println("not neon number");//not neon number
    	   
       }
	}
       

	
}



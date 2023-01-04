package Strings;


import java.util.Scanner;

public class XylemNumber {
	static void tocheckxylemnumber(int arr[]) {//array[5,5,4,3,2,1]
		int sum1=arr[0]+arr[arr.length-1];//5+1=6
		int sum2=0;
		for(int ctr=1; ctr<=arr.length-2 ;ctr++) {//5 4 3 2 
			sum2+=arr[ctr];//5+4+3+2=14
		}		
		System.out.println((sum1 == sum2)? "Xylem Number" : "phloem Number");//6!=14 phloem
	}
	static void todividedividedigits(int array[],int number) {//6,123455
		 for(int ctr=0;ctr<array.length && number!=0;ctr++) {//0 1 2 3 4 5 
		array[ctr]=number%10;//5 5 4 3 2 1  
		number/=10;//12345 1234 123 12 1 0
		 }
		 tocheckxylemnumber( array);	//call method	
	}
	public static void main(String[] args) {
		 Scanner scanObj=new Scanner(System.in);
		System.out.println("enter a number to check whether it is xylem or polem");
		try {
		int number = scanObj.nextInt();		//123455
		if(number>0) {
		int digits=Digits.tocountdigits(number);//call method
		int sizeofarray[] =new int[digits];//6
		todividedividedigits(sizeofarray,number);//array[6],123455
		}
		else {
			System.out.println("enter valid number");
		}
		}	
	catch(Exception obj) {
	System.out.println("InputMismatchException");
	}

}
}


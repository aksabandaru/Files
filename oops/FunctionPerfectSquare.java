package oops;
import java.util.Scanner;

public class FunctionPerfectSquare {
	
	//boolean flag=true;
	 static boolean PefectSquare(int userNumber) {
		boolean flag=true;
    //121
    for( int ctr=1;ctr<=userNumber;ctr++) {//1 2 3 4 5 6 7 8 9 10 11
    //121=1*1 121=2*2 121=3*3 121=4*4 121=5*5 121=6*6 121=7*7 21=8*8 121=9*9121=10*10 121=11*11
    	if(userNumber==ctr*ctr) {
   	 flag=false;
   	 System.out.println(userNumber+" "+"is a perfectSquare at "+ctr);
   	 break;
    }
    }
    if(flag==true) {
   	 System.out.println(userNumber+" "+"is not a perfectsuqare number");  
   	 
    }
    return flag;
    }
    

	public static void main(String[] args) {
		Scanner scanObj = new Scanner(System.in);
		System.out.println("enter a number");//121
		int userNumber = scanObj.nextInt();

		
		
		
	}

}

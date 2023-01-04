package oops;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {

     Scanner scanObj = new Scanner(System.in);
     System.out.println("enter a number");//256
     int userNumber = scanObj.nextInt();
     boolean flag=true;
     
     for( int ctr=1;ctr<=userNumber;ctr++) {
     if(userNumber==ctr*ctr) {//1*1 2*2.......16*16
    	 flag=false;
    	 System.out.println(userNumber+" "+"is a perfectSquare");
    	 break;
     }
     }
     if(flag==true) {
    	 System.out.println(userNumber+" "+"is not a perfectsuqare");     }
     
	}
	}



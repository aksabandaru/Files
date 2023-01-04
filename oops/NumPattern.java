package oops;
import java.util.Scanner;

public class NumPattern {

	public static void main(String[] args) {
	     Scanner scanObj = new Scanner (System.in);
	     System.out.println("enter a number");
	     int size=scanObj.nextInt();
	     System.out.println("enter the values");
	     int arr[]=new int[size];
	     for (int ctr = 0;ctr<=size;ctr++) {
	    	 arr[ctr]=scanObj.nextInt();
	     }
	     //to print how many lines depends upon the user number
	     for (int ctr = 1;ctr<=size;ctr++) {
	     
	    	 for(int i=size;i>arr[ctr];i--) {
	    		 System.out.print(" ");
	    	 
	    	 
	    	 
	    	 //1st row only print 1Time 1
	    	 //2st row print 2 times 2
	    	 //3st row print 3 times 3
	    	 for(int ctr1=1;ctr1<=ctr;ctr1++) {     
	    	 System.out.print(ctr+" ");
	    	 }
	     
	     System.out.println();
	     }
	}

}
}


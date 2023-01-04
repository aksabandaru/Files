package oops;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanobj = new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size = scanobj.nextInt();
		//System.out.println("enter the elements");
		int arr[] =new int[size];
		 int ctr=0;
		 while(ctr<size) {
		 //for(ctr=0;ctr<size;ctr++) {
			 arr[ctr]=scanobj.nextInt();
		 ctr++;
		 }
		 float sum=0f;
		
		 for(ctr=0;ctr<size;ctr++)
		
		  {
			 sum=sum+arr[ctr];	 
		  }
			 System.out.println(sum);
		
			 System.out.println(sum/2);
		 
		 

	}

}

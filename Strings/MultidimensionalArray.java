package Strings;

public class MultidimensionalArray {
	public static void main(String[] arga) {
		int array[][]= {{25,10,43},{23,56,78,90},{34,67}};
		int ctr=0;
		while(ctr<array.length) {
			int ctr1=0;
			while(ctr1<array[ctr].length) {
			System.out.print(array[ctr][ctr1]+" ");	
		ctr1++;
			}
			System.out.println();
			ctr++;
}
System.out.println(array.length);		
	
}
}


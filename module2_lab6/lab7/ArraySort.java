package LabBook7;

import java.util.Arrays;

public class ArraySort {

		public static void main(String[] args) {
			String array[] = new String[] {"aakash","akshay","ramu","bunty","chary","ashok","chotu"};
			for(int i=0;i<array.length;i++)
				System.out.println(" element "+(i+1)+" is "+array[i]);
			
			System.out.println(" array after sorting : ");
			//sorting strings in array
			Arrays.sort(array);
			int j=0;
			//use of for each loop
			for(String x :array) {
				System.out.println("element "+j+" is "+x);
				j++;
		}
		}
}

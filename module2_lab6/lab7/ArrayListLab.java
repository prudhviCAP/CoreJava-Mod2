package LabBook7;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLab {

		public static void main(String[] args) {
			
			ArrayList<String> arr = new ArrayList<String>();
			arr.add("brush");
			arr.add("paste");
			arr.add("shoes");
			arr.add("shirts");
			arr.add("cakes");
			arr.add("biscuits");
			//to say that arrayList allows duplicates
			arr.add("brush");
			//to perform remove method
			arr.remove("shoes");
			arr.add("shoes");
			
			//implement for-each loop
			for(String x: arr)
				System.out.println(x);
			
			System.out.println(" arraylist after  sorting ");
			
			Collections.sort(arr);
			
			for(String y: arr)
				System.out.println(y);
		}
}

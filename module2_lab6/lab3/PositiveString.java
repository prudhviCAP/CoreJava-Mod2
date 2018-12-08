import java.util.Scanner;

public class PositiveString {

		void pString(String input)
		{
			int count=0;
			char[] array = input.toCharArray();
			for(int i=1;i<array.length;i++) {
			if((Character.toLowerCase(array[i-1])>(Character.toLowerCase(array[i]))))
					count++;
			}
					
			if(count==0) {
				System.out.println("given string is positive string");
			}
			else
				System.out.println("given string is negative string");
			
		}
		public static void main(String[] args) {
			PositiveString posString = new PositiveString();
			String input;
			Scanner in = new Scanner(System.in);
			System.out.println("enter string:  ");
			input=in.nextLine();
			posString.pString(input);
		}
}

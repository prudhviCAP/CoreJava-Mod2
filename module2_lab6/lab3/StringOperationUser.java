import java.util.Scanner;

public class StringOperationUser {
	public void stringOperation()
	{
		String sample;
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter string :");
		sample=in.next();
		int option;
		
		System.out.println("enter option: ");
		option=in.nextInt();
		
		switch(option) {
		case 1:
				sample=sample.concat(sample);
				System.out.println("sample after performing string operation is :  "+sample);
				break;
		case 2: 
				for (int i=0; i < sample.length(); i++){
					if (i % 2 != 0){
						sample = sample.substring(0,i-1) + "#" + sample.substring(i, sample.length());
					}
				};
				System.out.println("sample after performing string operation is :  "+sample);
				break;
		case 3:
				sample=removeDuplicates(sample);
				System.out.println("sample after performing string operation is :  "+sample);
				break;
		case 4:
			for (int i=0; i < sample.length(); i++){
				if (i % 2 != 0){
					sample = sample.substring(0,i-1) +sample.toUpperCase().charAt(i)+ sample.substring(i+1, sample.length());
				}
			};
			System.out.println("sample after performing string operation is :  "+sample);
			break;
			
		default:
			sample="user did not choose proper option";
			
			System.out.println(sample);
		
		}
	}
	public String removeDuplicates(String input)
	{
	    String result = "";
	    for (int i = 0; i < input.length(); i++) 
	    {
	        if(!result.contains(String.valueOf(input.charAt(i))))
	        {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		StringOperationUser obj = new StringOperationUser();
		obj.stringOperation();
		
	}
}

package AgeNameMethod;

public class AgeCalculationMain {
	
	public static void main(String[] args) 
	{
		AgeCalculation p=new AgeCalculation("bill","gates",'M');
		System.out.println(p);
		p.calcAge();
		p.getFullName("bill", "gates");
	}

}

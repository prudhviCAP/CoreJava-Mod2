package bankCaseStudy;

public class Person {

		private String name;
		private float age;
		int flag = 0;
		
		public String getName() {
			return name;
		}
		public Person(String name, float age) {
			super();
			this.name = name;
			this.age = age;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getAge() {
			System.out.println("you can die now");
			return age;
		}
		public void setAge(float age) {
			this.age = age;
		}
		
		public void exHandler()
		{
			try
			{
				if (getAge() < 15)
				{
					flag = 1;
					throw new AgeException("\nAge less than 15");
				}
			} catch (AgeException ae)
			{
				System.out.println("Exception " + ae.getMessage());

			}
		}
}

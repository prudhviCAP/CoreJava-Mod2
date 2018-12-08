package com.cg.eis.service;

public class Service implements EmployeeService{

		private double salary;
		private String designation;
		private String insuranceScheme;
		
		
		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public String getDesignation() {
			return designation;
		}


		public void setDesignation(String designation) {
			this.designation = designation;
		}

		

		@Override
		public String toString() {
			return " [salary=" + salary + ", designation=" + designation + "]";
		}


		@Override
		public void employeeInsurance() {
			if(salary>5000 && salary<20000 )
				insuranceScheme = "Scheme C";
			else if(salary>=20000 && salary<40000)
				insuranceScheme = "Scheme B";
			else if(salary>=40000)
				insuranceScheme = "Scheme A";
			else if(salary<5000)
				insuranceScheme = "No Scheme";
			else 
				System.out.println("cant assign a scheme");
			System.out.println("Insurence scheme of employee is: "+insuranceScheme);
		}
		
}

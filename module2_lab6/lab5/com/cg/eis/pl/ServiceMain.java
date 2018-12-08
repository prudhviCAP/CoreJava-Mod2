package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class ServiceMain {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);	
			System.out.println(" enter name of employee ");
			String nm = in.nextLine();
			System.out.println(" enter id of employee ");
			int empid = in.nextInt();
			System.out.println(" enter salary of employee ");
			double sal = in.nextDouble();
			System.out.println(" enter designation of employee ");
			String desgn = in.next();
			
			Service ser1 = new Service();
				ser1.setSalary(sal);
				ser1.setDesignation(desgn);
				System.out.println(ser1.getDesignation());
			Employee emp = new Employee();
				emp.setName(nm);
				emp.setId(empid);
				System.out.println(emp.getName());
				
			System.out.println(emp+" "+ser1);
			ser1.employeeInsurance();

		}
}

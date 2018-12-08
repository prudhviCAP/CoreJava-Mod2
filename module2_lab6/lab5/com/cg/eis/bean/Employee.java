package com.cg.eis.bean;

public class Employee {
	
		private int id;
		private String name;
		private double salary;
		private String designation;
		private char insurenceScheme;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}
}

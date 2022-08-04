package com.phenoix.demos;

public class MainApp {

	public static void main(String[] args) {
		
		Date d=new Date(12,6,2000);
		Employee e1=new Employee(101,"priyanshi",d);
		Employee e2=new Employee(102,"Dhanashri",new Date(20,5,2017));
		Employee e3=new Employee(103,"Dipali",new Date(19,13,2017));
		Employee e4=new Employee(104,"shivani",new Date(27,3,2019));
		Employee e5=new Employee(105,"pranay",new Date(28,2,2015));
		
		/*Date d2=new Date();
		d2.setDay(34);
		d2.setMonth(11);
		d2.setYear(2012);
		Employee e6=new Employee(106,"pratik",d2);*/
		
		System.out.println("EmpNo\tEmpName\t\tEmpJoiningDate");
		System.out.print("\n");
		e1.Display();
		e2.Display();
		e3.Display();
		e4.Display();
		e5.Display();
		//e6.Display();
		e3.addInteger(15);
		e3.Display();
	}

}

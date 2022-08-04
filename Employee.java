package com.phenoix.demos;

public class Employee{

	int EmpNo;
	String EmpName;
	Date JoinDate;
	
	Employee()
	{
		
	}
	
	Employee(int ENo,String EName,Date JD)
	{
		this.EmpNo = ENo;
		this.EmpName = EName;
		this.JoinDate = JD;
	}
	
	public int getEmpNo() {
		return EmpNo;
	}

	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	
	
	public String getJoinDate() {
		return this.JoinDate.day+"/"+this.JoinDate.month+"/"+this.JoinDate.year;
	}

	public void setJoinDate(Date joinDate) {
		JoinDate = joinDate;
	}

	public void Display()
	{
		System.out.println(this.EmpNo+"\t"+this.EmpName+"\t"+this.getJoinDate());
		
	}
	
	public String toString()
	{
		return EmpNo+EmpName+getJoinDate();
		
	}
	public void addInteger(int day)
	{
	      int d=this.JoinDate.day+day;
	      int m=this.JoinDate.month;
	      
	      if(d>29 && this.JoinDate.month==2 && this.JoinDate.year%4==0)
	      {
		      d=d-29;  
		      this.JoinDate.setDay(d);
		      this.JoinDate.month+=1;
		      return;
	      }
	      if(d>28 && this.JoinDate.month==2 && this.JoinDate.year%4!=0)
	      {
		      d=d-28;
		      this.JoinDate.setDay(d);
		      this.JoinDate.month+=1;
		      return;
	      }
	      if(d>30&&(m==4||m==6||m==9||m==11))
	      {
		      d=d-30;
		      this.JoinDate.setDay(d);
		      this.JoinDate.month+=1;
		      
	      if(this.JoinDate.month>=12)
	      {
	       this.JoinDate.setMonth(1);
	       this.JoinDate.year+=1;
	      }
	      
	       return;
	      }
	      
	      if(d>31&&(m==1||m==3||m==5||m==7||m==8||m==10||m==12))
	      {
		      d=d-31;
		      this.JoinDate.setDay(d);
		      this.JoinDate.month+=1;
		      
	      if(this.JoinDate.month>=12)
	      {
	       this.JoinDate.setMonth(1);
	       this.JoinDate.year+=1; 
	      }
	       return;
	      }
	       this.JoinDate.setDay(d);
	}
}

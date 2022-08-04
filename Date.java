package com.phenoix.demos;

public class Date {
	int day;
	int month;
	int year;
	
	
	public Date()
	{
		this.day=1;
		this.month=1;
		this.year=2000;
	}
	
	public Date(int d,int m,int y)
	{
		check(d,m,y);
		
	}
	
	
	public void setDay(int day) 
	{	
		int m=month;
		int y=year;
			
		if(day>=0 && day<=29 && (m==2) && (y%4==0))
		  {
		     this.day = day;
		  }
		 else if((day>=0 && day<=28 && m==2) && (y%4!=0))
		  {
			 this.day = day;
		  }
		 else if(day>=0&&day<=30&&(m==4||m==6||m==9||m==11))
		 {
			 this.day = day;
		 }
		 else if(day>=0&&day<=31&&(m==1||m==3||m==5||m==7||m==8||m==10||m==12))
		 {
			 this.day = day;
		 }
		 else
		 {
			  System.out.println("Invalid Day");
			  this.day=0;
		 }
			
	}

	public int getDay() 
	{
		return day;
	}
	
	public void setMonth(int month)
	{
		if(month>0 && month<=12)
	   {
	    this.month = month;
	   }
		else
		   {
		    System.out.println("Invalid Month");
		    this.month=0;
		   }
	}
	
	public int getMonth() {
		return month;
	}

	public void setYear(int year) 
	{	
		 if(year<=2022)
		   {
		      this.year = year;
		   }
		   else
		   {
		     System.out.println("Invalid Year");
		   }

	}

	public int getYear() {
		return year;
	}

	public void display(){
		
	 System.out.println(day+"/"+month+"/"+year);
	}

	public void check(int d,int m,int y)
	{
		if(d>0&&d<=29&&(m==2)&&(y%4==0))
		 {
		  day=d;
		  month=m;
		  year=y;
		 }
		 else if((d>0&&d<=28&&m==2)&&(y%4!=0))
		   {
		         day=d;
		         month=m;
		         year=y;
		   }
		 else if(d>0&&d<=30&&(m==4||m==6||m==9||m==11))
		 {
		   day=d;
		   month=m;
		   year=y;
		 }
		 else if(d>0&&d<=31&&(m==1||m==3||m==5||m==7||m==8||m==10||m==12))
		 {
		    day=d;
		    month=m;
		    year=y;
		 }
		 else
		 {
		   System.out.println("Invalid Date");
		 }
		  
		
	}
	
	
	
}

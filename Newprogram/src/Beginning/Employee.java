package Beginning;

public class Employee 
{
    /* int empid;   /// class variables using object
    String empname;
    int salary;
    char level;
    void display()
    {
    	System.out.println("Employee ID:"+empid);
    	System.out.println("Employee name:"+empname);
    	System.out.println("Employee salary:"+salary);
    	System.out.println("Employee level:"+level);
    }
    public static void main(String[] args)
    {
    	Employee emp1=new Employee();
    	emp1.empid=101;
    	emp1.empname="hari";
    	emp1.salary=20000;
    	emp1.level='V';
    	emp1.display();		
    }  */
	
	 /*      // class varibale using constructor
	  int empid;  
	 String empname;
	 int salary;
	 char level;
	Employee(int id,String name,int sal,char grade)
	{
		empid=id;
		empname=name;
		salary=sal;
		level=grade;
	}
	void display()
	{
		System.out.println("Employee ID:"+empid);
    	System.out.println("Employee name:"+empname);
    	System.out.println("Employee salary:"+salary);
    	System.out.println("Employee level:"+level);
    	System.out.println("");
    }
   public static void main(String[] args)
   {
	 Employee emp1=new Employee(101,"Hari",20000,'V');
	 emp1.display();
	 
	 Employee emp2=new Employee(102,"Mani",23000,'V');
	 emp2.display();
   }   	 
	  */
	  int empid;  
		 String empname;
		 int salary;
		 char level;
		 void setdata(int id,String name,int sal,char grade)
		 {
				empid=id;
				empname=name;
				salary=sal;
				level=grade;
			} 
		void display()
		{
			System.out.println("Employee ID:"+empid);
	    	System.out.println("Employee name:"+empname);
	    	System.out.println("Employee salary:"+salary);
	    	System.out.println("Employee level:"+level);
	    	System.out.println("");
	    }
	   public static void main(String[] args)
	   {
		 Employee emp1=new Employee();
		 emp1.setdata(101,"Hari",20000,'V');
		 emp1.display();
		 
		 Employee emp2=new Employee();
		 emp2.setdata(102,"Mani",23000,'V');
		 emp2.display();
	   }
}


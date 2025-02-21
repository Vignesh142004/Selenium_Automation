package Day1;
public class Employee {
	//variable
	int empId;
	String empName;
	String jobDes;
	int salary;
	
	//method
	void display()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(jobDes);
		System.out.println(salary);
	}
	
	public static void main(String args[])
	{
		Employee obj1=new Employee();
		obj1.empId=101;
		obj1.empName="Aman";
		obj1.jobDes="Quality Engineer";
		obj1.salary=50000;
		System.out.println("Employee 1 Details: ");
		obj1.display();	
		
		Employee obj2=new Employee();
		obj2.empId=102;
		obj2.empName="John";
		obj2.jobDes="Fullstack Develper";
		obj2.salary=75000;
		System.out.println("Employee 2 Details: ");
		obj2.display();
		
	}

}

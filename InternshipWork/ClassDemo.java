package InternshipWork;
import java.util.*;
public class ClassDemo {
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
		ClassDemo obj1=new ClassDemo();
		obj1.empId=101;
		obj1.empName="Aman";
		obj1.jobDes="Quality Engineer";
		obj1.salary=50000;
		System.out.println("Employee1 Details: ");
		obj1.display();	
	}

}

package Day1;

public class Student {
	 
	int sid;
	String sname;
	char grade;
	Student(int sid, String sname, char grade) // constructor
	{
		this.sid=sid;
		this.sname=sname;
		this.grade=grade;
	}
	
	void printdetails()
	{
		System.out.println(sid+" "+sname+" "+grade);
	}
	/*void setstudentdetails(int id,String name, char g)
	{
		sid=id;
		sname=name;
		grade=g;
	}*/
	

}

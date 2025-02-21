package Day1;

public class MethodDemo {
	 void method1()// No parameter and No return value
	 {
		 System.out.println("Hello...."); 
	 }
	 String method2()// No parameter and with return value
	 {
		 return "How are you?";
	 }
	 void method3(String name)// with parameter and no return value
	 {
		 System.out.println("Hello "+name);
	 }
	 String method4(String name)// with parameter and return value
	 {
		 return "Hello "+name;
	 } 
	public static void main(String[] args) 
	{
		MethodDemo m=new MethodDemo();
		m.method1();
		String s1=m.method2();
		System.out.println(s1);
		m.method3("Hari haran");
		String s2=m.method4("Rahul");
		System.out.println(s2);
	}
}

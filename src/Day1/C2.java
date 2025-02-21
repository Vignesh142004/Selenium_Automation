package Day1;

public class C2 implements I1, I2
{
      public void show1()
      {
    	  System.out.println("This is the abstract method from Interface 1");
    	  System.out.println(x);
      }
      public void show2()
      {
    	  System.out.println("This is the abstract method from Interface 2");
    	  System.out.println(y);
      }
      public static void main(String args[])
      {
    	  C2 obj=new C2();
    	  obj.show1();
    	  obj.show2();
      }
}

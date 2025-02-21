package vignesh;

public class Arithmatic 
{
  public static void main(String args[])
  {
	  // +,-,*,/,%
	  int a=11,b=5,c,d,e,f,g;
	  c=a+b;
	  d=a-b;
	  e=a*b;
	  f=a/b;// 11=divident, 5=divisor,qoutient=2.1 remainder=1
	  g=a%b;// modulo oper will return remainder
	  System.out.println(c);
	  System.out.println(d);
	  System.out.println(e);
	  System.out.println(f);// divide oper return quotient
	  System.out.println(g);
	  
	  //Compound Assignment Operator
	    a=a+5;
	    System.out.println(a);
	    a+=5;// both are similar
	    System.out.println(a);
	    
	  //Increment and Decreament
	    
	    b++;//6,post increament
	    System.out.println(b);
	    ++b;//7,pre increament
	    System.out.println(b);
	    b--;//6,post decreament
	    System.out.println(b);
	    --b;//5, pre decreament
	    System.out.println(b);
	    
	    
	    
	    
	    
	  
  }
}

package vignesh;

public class Literals 
{
   public static void main(String args[])
   {
	   int a=100;// 100 is a numeric literal
	   float f=8.700f;// floating point literal
	   long l=1000l;
	   char c='a';// character literal
	   boolean ab=true;// boolean literal
	   
	   // Escape sequence
	   System.out.println("Hello World");
	   System.out.println("Hello\nWorld");//\n
	   System.out.println("Hello \tWorld");//\t
	   System.out.println("\'Hello World\'");// \'
	   System.out.println("\"Hello World\'");// \"
	   System.out.println("\rHelloWorld");// \r
	     
	   // octal,Hexadecimal,binary
	   int octal=010;// It takes octal value
	   int hexadecimal=0xE;//It takes hexadecimal value
	   int binary=0b111;// It takes binary value
	   System.out.println(octal);
	   System.out.println(hexadecimal);
	   System.out.println(binary);
	   
	   //implicit typecasting
	    byte b=5;
	    int n;
	    n=b;// left hand side should be graeter
	    System.out.println(n);
	    
	    // explicit typecasting
	    byte b1;
	    int n1=20;
	    b1=(byte)n1;
	    System.out.println(b1);
	    
	    
	    // It is a single line comment line
	    /* This is multiline comment line the instruction with 
	      in the symbol  are not  complied by compiler 
	     */
   }
}

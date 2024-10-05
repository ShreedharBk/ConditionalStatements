package functions.SRM;

//Calling a static regular method from same class
public class SRM_call_same_class                  //class declaration
{
	public static void main(String[] args)       // main method declaration
	{
		m1();   //methodName();
		m2();
	}
	
	public static void m1()
	{
		System.out.println("I can do it: --same class");
	}
	
	public static void m2()
	{
		System.out.println("Time is money: --same class");
	}	
}

/*
 static regular method from call from same class-->  
 
 							1.    public static void methodname()        
  	call instruction-->     2.    methodname();   --> use this in main method
 
*/





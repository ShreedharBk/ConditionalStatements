package functions.NSRM;

//Calling a Non Static regular method from different class
public class NSRM_call_different_class 
{
	public static void main(String[] args) 
	{	
		//classname objectname = new classname();
		Different_class Object=new Different_class();  //Object Creation
		
		//ObjectName.MethodName();
		Object.m3();
		Object.m4();	
	}
}

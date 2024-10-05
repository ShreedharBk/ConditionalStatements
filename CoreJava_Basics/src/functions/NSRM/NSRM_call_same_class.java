package functions.NSRM;

//Calling a non-static method call from same class 
	//--> 1. Create object of the same class  2. objectname.methodname();
public class NSRM_call_same_class {
	public static void main(String[] args) 
	{    
		//classname objectname=new classname();	
		NSRM_call_same_class Obj=new NSRM_call_same_class();
		
		Obj.m1();  //objectname.methodname();
		Obj.m2();	
	}
	
	//non static regular method
	public void m1()
	{
		System.out.println("Sample1: same class");
	}
	
	public void m2()
	{
		System.out.println("Sample2: same class");
	}
}

/*
nsrm_call_same_class-->Classname-->datatype
Obj-->objectname-->to refer/identify object

new-->keyword-->to create blank/empty object
nsrm_call_same_class()-->constructor-->copy all data of class into object
*/
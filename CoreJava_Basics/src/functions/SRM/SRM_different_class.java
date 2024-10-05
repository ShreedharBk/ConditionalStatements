package functions.SRM;

//Calling a static regular method from different class
public class SRM_different_class 
{
	public static void main(String[] args) 
	{
		//ObjectName.MethodName();
		Different_class2.m3();
		Different_class2.m4();		
	}
}


/*
static regular method call from different class-->  

							1.    public static void methodname()        <--- Create this in a different class
 	call instruction-->     2.    classname.methodname();                <--- Create this in main method class

*/
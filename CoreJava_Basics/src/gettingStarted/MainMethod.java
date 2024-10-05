package gettingStarted;

public class MainMethod
{	
	public static void main(String[] args) 
	{
		
	}
}

/* 
public : It is an Access modifier, which specifies from where and who can access the method. 
         Making the main() method public makes it globally available.
         It is made public so that JVM can invoke it from outside the class as it is not present in the current class.
         If the main method is not public, it’s access is restricted.
         	Error: Main method not found in class, please define the main method as: psvm
         
static : It is a keyword that is when associated with a method, making it a class-related method. 
         The main() method is static so that JVM can invoke it without instantiating the class. 
         This also saves the unnecessary wastage of memory which would have been used by the object declared only for calling the main() method by the JVM.
         If you try to run Java code where main is not static, you will get an error.
         	Error: Main method is not static in class test, please define the main method as: psvm
         	
void  :  It is a keyword and is used to specify that a method doesn’t return anything.
		 As the main() method doesn’t return anything, its return type is void. As soon as the main() method terminates, the Java program terminates too. 
		 Hence, it doesn’t make any sense to return from the main() method as JVM can’t do anything with its return value of it.
		 If main method is not void, we will get an error.
		 	Error: Main method must return a value of type void in class Main, please define the main method as: psvm
		 
main  :  It is the name of the Java main method. 
         It is the identifier that the JVM looks for as the starting point of the Java program. It’s not a keyword.
         If we change the name while initiating main method, we will get an error.
         	Error: Main method not found in class, please define the main method as:
         	
String[ ]args :  It stores Java command-line arguments and is an array of type java.lang.String class. 
                 Here, the name of the String array is args but it is not fixed and the user can use any name in place of it. 

*/

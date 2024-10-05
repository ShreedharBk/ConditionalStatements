package gettingStarted;

public class PrintingStatement {
	public static void main(String[] args) {	
		System.out.println("Hello World");
	}
}

/* 
System: It is a final class defined in the java.lang package.

out: This is an instance of PrintStream type, It is public and static member field of the System class.
		defined like this -->  public static final PrintStream out = null;
		
println(): It is a public method of the PrintStream class, we can invoke the same on out as well. 
           This is an upgraded version of print(). It prints any argument passed to it and adds a new line to the output. 
           We can assume that System.out represents the Standard Output Stream. 
*/
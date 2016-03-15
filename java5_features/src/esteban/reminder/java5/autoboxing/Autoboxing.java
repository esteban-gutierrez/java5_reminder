package esteban.reminder.java5.autoboxing;

/**
 * Illustrates with example methods the use of autoboxing and unboxing.
 * 
 * Autoboxing is the automatic conversion that the Java compiler makes between the primitive 
 * types and their corresponding object wrapper classes. For example, converting an int to an
 * Integer, a double to a Double, and so on.
 * 
 * The Java compiler applies autoboxing when a primitive value is:
 * - Passed as a parameter to a method that expects an object of the corresponding wrapper class.
 * - Assigned to a variable of the corresponding wrapper class.
 * 
 * @author estebangm
 */
public class Autoboxing {

	/**
 	 * Autoboxes three primitive variables to their corresponding object wrappers.
 	 * Then these values are printed in the console among with their class name.
	 */
	public void primitiveAutoboxing() {
		Integer i = 4;
		Float f = 120.52f;
		Character c = 'h';
		System.out.println("Integer = " + i + " of type " + i.getClass().toString()
				+ "\nFloat = " + f + " of type " + f.getClass().toString()
				+ "\nCharacter = " + c + " of type " + c.getClass().toString());
	}

	/**
	 * Executes the method that autoboxes and prints three different primitive variables. 
	 * @param args arguments (not in use)
	 */
	public static void main(String [] args) {
		Autoboxing a = new Autoboxing();
		a.primitiveAutoboxing();
	}
}

package esteban.reminder.java5.unboxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Inverse conversion to the one described for autoboxing: an object wrapper class can be 
 * automatically converted to its corresponding primitive type object.
 * 
 * @author estebangm
 */
public class Unboxing {

	/**
	 * Consider the code in the method body.
	 * 
	 * Although you add the int values as primitive types (rather than Integer objects) to li,
	 * the code compiles. Because li is a list of Integer objects, not a list of int values, you
	 * may wonder why the Java compiler does not issue a compile-time error. The compiler does not
	 * generate an error because it creates an Integer object from i and adds the object to li.
	 * Thus, the compiler converts the previous code to the following at runtime.
	 * 
	 * This is the same behaviour as in the method body: 
	 * List<Integer> li = new ArrayList<>();
	 * for (int i = 1; i < 50; i += 2) {
	 *     li.add(Integer.valueOf(i));
	 * }
	 */
	public void objectWrapperUnboxing() {
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 50; i += 2) {
			li.add(i);
		}
		for (Integer itg : li) {
			System.out.println(itg + " of type " + itg.getClass().toString());
		}
	}

	/**
	 * Executes the method that unboxes and prints three different object wrapper variables. 
	 * @param args arguments (not in use)
	 */
	public static void main(String [] args) {
		Unboxing u = new Unboxing();
		u.objectWrapperUnboxing();
	}
}
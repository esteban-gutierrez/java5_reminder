package esteban.reminder.java5.for_in;

import java.util.Iterator;
import java.util.List;

import esteban.reminder.java5.utils.AuxiliaryOperations;

/**
 * Shows an example of the new feature in Java 5 regarding to loop 'for': in.
 * 
 * @author estebangm
 */
public class ForInLoop {

	/**
	 * Use of iterators to traverse through a list using a 'for' loop.
	 */
	public void deprecatedForLoop() {
		List list = AuxiliaryOperations.initList();
		for (Iterator lineup = list.iterator(); lineup.hasNext(); ) {
			Object thatThing = lineup.next();
			System.out.println(thatThing);
		}
	}

	/**
	 * Shortened way to iterate in a 'for' loop.
	 */
	public void iterateJava5ForLoop() {
		List<String> list = AuxiliaryOperations.initList();
		for (String thatThing : list) {
			System.out.println(thatThing);
		}
	}

	/**
	 * Shortened way to iterate an array.
	 */
	public void iterateJava5Array() {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		for (int n : nums) {
			System.out.println(n);
		}
	}

	/**
	 * Runs methods that iterate a list and an array, respectively, both using the new feature
	 * introduced in Java 5. 
	 * @param args arguments (not in use)
	 */
	public static void main(String [] args) {
		ForInLoop fil = new ForInLoop();
		System.out.println("a) Iterating a 'for' loop without Iterator:");
		fil.iterateJava5ForLoop();
		System.out.println("b) Iterating an array in Java 5 way:");
		fil.iterateJava5Array();
	}
}

package esteban.reminder.java5.typesafe_enums;

/**
 * This is an example of the type safe enumerations introduced in Java 5.
 * 
 * Enums are just magic classes to help prevent the methodless-interface antipattern.
 * They let you make classes that will enumerate values, but also keep the types specific.
 * Before, we could simulate enums with a bunch of static final int variables or something.
 * The problem with those is that you could confuse any int with one of the constants. With
 * enumerations, only the values in the enum are valid.
 *
 * @author estebangm
 */
public class TypeSafeEnums {

	/**
	 * Enumeration with the names of the staff.
	 * 
	 * Now it is not necessary to keep track of separate information to store, say the peoples' full
	 * names. They can be associated directly, just like in a class. Each of the values of JettStaff
	 * are instances of the JettStaff enumeration, so it is possible to define a constructor and a
	 * toString() method.
	 * 
	 * You can also give each enumerated value a custom body. Since they're each instances, you
	 * could design a toString() method for each.
	 * 
	 * Finally, Enums can extend each other.
	 *
	 * @author estebangm
	 */
	public enum JettStaff {
		ADRIAN("Adrian German") { 
			public String toString() {
			    return this.getName() + " (dgerman@indiana.edu)";
			}
		},
		ARJIT("Arjit Sengupta") {
			public String toString() {
				return this.getName() + " (asengupt@indiana.edu)";
			}
		},
		BETH("Beth Plale"),
		ERIC("Eric Wernert"),
		KATIE("Katie A. Siek"),
		KATY("Katy Borner"),
		RAJA("Raja Sooriamurthi"),
		RICH("Rich Kick"),
		SUZANNE("Suzanne Menzel");

		private String name;

		public String getName() {
			return name;
		}
		private JettStaff(String n) {
			this.name = n;
		}
		public String toString() {
			return this.name;
		}
	}

	/**
	 * Iterates the Enums values and print them.
	 * 
	 * @param args arguments (not in use)
	 */
	public static void main(String [] args) {
		for (JettStaff js : JettStaff.values()) {
			System.out.println(js);
		}
	}
 }

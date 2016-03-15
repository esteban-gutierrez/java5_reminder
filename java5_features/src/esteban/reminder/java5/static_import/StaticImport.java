package esteban.reminder.java5.static_import;

/*
 * Here it is the static import:
 */
import static esteban.reminder.java5.utils.FooConstantsClass.*;

/**
 * Remember making all those interfaces that just have constants in them?
 * (See 'FooInterface' in this package).
 * 
 * Scrap that. Put these into a REAL class and then just import the static members from all the
 * other ones using import static <Package or Class>;.
 * This addition is pretty straightforward, and it helps prevent bloat and the
 * "methodless interface" design anti-pattern.
 *
 * @author estebangm
 */
public class StaticImport implements FooInterface {

	/**
	 * Prints in the console the constants stored in the interface implemented (this is not the 
	 * correct way) and then prints them again but this time taking them from a class that is
	 * imported statically.
	 * 
	 * @param args arguments (not in use)
	 */
	public static void main(String [] args) {
		System.out.println("Constants from the interface (bad practise):");
		System.out.println(FooInterface.BACK_COLOR);
		System.out.println(FooInterface.WHITE_COLOR);
		System.out.println(FooInterface.BALL_SIZE);
		System.out.println("Constants from the static import class:");
		System.out.println(RED_COLOR);
		System.out.println(GREEN_COLOR);
	}
}

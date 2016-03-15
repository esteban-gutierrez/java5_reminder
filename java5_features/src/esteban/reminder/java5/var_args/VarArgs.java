package esteban.reminder.java5.var_args;

/**
 * Makes use of the feature introduced in Java 5 related to the variable number of arguments.
 *
 * @author estebangm
 */
public class VarArgs {

	/**
	 * Uses an array of strings as arguments.
	 * 
	 * @param args array of strings
	 */
	public void useArray(String[] args) {
		System.out.println("You introduced " + args.length + " arguments using an array.");
	}

	/**
	* Notice how when you pass arguments from the command line ...
	* 
	* C:/> java MyProg a b c
	* You introduced 3 arguments using var arguments!.
	* 
	* ... you don't have to pass an array of stuff. The runtime automatically converts the arguments
	* into an array of strings. You can do that now in all of your methods.
	* 
	* You can declare it more easily, and not have to construct the array ahead of time.
	* 
	* Notice that when you use the ... syntax, it automatically treats that parameter as an array
	* but you don't have to pass it in that way.
	*/
	public void useVarArgs(String... args) {
		System.out.println("You introduced " + args.length + " argsuments using var arguments!");
		for (String s : args) {
			System.out.println(s);
		}
	}

	/**
	 * Shows the traditional way and the Java 5 way to pass arguments to a method, and for the
	 * second way these arguments are printed in the console.
	 * 
	 * @param args arguments (not in use)
	 */
	public static void main(String [] args) {
		String[] newArgs = {"a", "b", "c"};
		VarArgs va = new VarArgs();
		va.useArray(newArgs);
		va.useVarArgs("hello", "how are you?", "I hope you're well", "See you later!");
	}
}

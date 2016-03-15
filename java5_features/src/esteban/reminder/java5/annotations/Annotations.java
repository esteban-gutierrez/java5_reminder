package esteban.reminder.java5.annotations;

/**
 * Annotations are not really something that will affect how you program in Java, unless you need
 * to associate some sort of metadata or annotations with classes, methods, variables, etc.
 * 
 * The annotations provide a little extra information about the classes you write, and a class
 * can use the Reflection package later to read the annotations. These are useful because you can
 * attach extra information to your code that may determine how it is used or maybe if it is used
 * at all.
 * 
 * In the above example, we declare that we will override the immediately following toString()
 * method. So the compiler looks in our superclass (Object) for the same metho and makes sure it
 * exists. If for some reason we had overloaded toString() by declaring it with different
 * parameters and maybe return type, then the compiler would throw an error saying we didn't
 * override correctly. This is really useful if you want to make sure you override a method as
 * opposed to simply overloading it.
 * 
 * The annotations require two-fold cooperation: the programmer must properly annotate the code to
 * provide adequate metadata needed and other developers who will want to know this metadata must
 * know how to extract it using the Java Reflection package.
 * 	
 * Example of use:
 * Say you are working with RMI (Remote Method Invocation) and you don't want all of your methods
 * available remotely. You could annotate the remotable ones with a @Remote annotation, then
 * whatever serves up the remote access can only allow those to be remotely accessed. There are a
 * ton of great uses for these, and they are fully extendable (you can also annotate annotations!).
 * 
 * @author estebangm
 */
public class Annotations {

	/**
	 * You can declare your intent to override a method like toString() in one of your classes.
	 * 
	 * Here we declare that we will override the immediately following toString() method. So the
	 * compiler looks in our superclass (Object) for the same method and makes sure it exists.
	 * If for some reason we had overloaded toString() by declaring it with different parameters and
	 * maybe return type, then the compiler would throw an error saying we didn't override
	 * correctly. This is really useful if you want to make sure you override a method as opposed to
	 * simply overloading it.
	 * 
	 * @return literal string "My overriden method!"
	 */
	@Override
	public String toString() {
		return "My overridden method!";
	}

	/**
	 * If it's been defined an annotation like 'ConferenceAnnotation', then you can use it to mark
	 * code that I use for the Jett conference. So now the @ConferenceAnnotation type of data is
	 * associated with the current class. This specific example doesn't have any effect on the way
	 * MyMagicJettClass operates.
	 */
	 @ConferenceAnnotation(what="JETT", when="November 2016", location="IUB")
	 public class MyMagicJettClass {
		 //...
	 }
}

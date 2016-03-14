package esteban.reminder.java5.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Illustrates the new feature of Java 5 about Generics.
 * 
 * @author estebangm
 */
public class EnhancedGenerics {

	/*
	 * Auxiliary method that returns a list of Strings.
	 * @return list of strings
	 */
	private List<String> initList() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("cheers!");
		list.add("have a nice day!");
		list.add("no way");
		return list;
	}

	/**
	 * Iterates a list of Strings and prints them on the console in a Java 1.4 way.
	 * 
	 * When using a type that can be parameterized, but not specifying the parameter
	 * type (in angle brackets) you can get lint warnings. This just means that you haven't provided
	 * a specific type, and the current definition of the type is "fuzzy" -- like lint, get it?
	 */
	public void iterateDeprecatedGenerics() {
		 List things = initList();
		 for (Iterator i = things.iterator(); i.hasNext(); ) {
		   String item = (String)i.next();
		   System.out.println(item);
		 }
	}
	
	/**
	 * Generics provide a way to create and use typesafe data structures. This means that no longer
	 * do you have to create a List of the basic Objects then typecast every time you pull stuff out!
	 * You can declare your list to automatically typecast the stuff inside.
	 * 
	 * The Java compiler also protects things from having non-String objects inside. If you try to
	 * put a Float or anything else in, you'll get an error. This essentially means that you can
	 * create a list with specific types now instead of just objects. These exist in other classes
	 * such as Map which uses two:
	 * 
	 * Map<String, WhateverClass> myMap = new HashMap<String, WhateverClass>();
	 * That creates a map that uses a String key and a WhateverClass value. This implementation
	 * kind of looks like something using templates in C++...
	 * 
	 * Be careful though! You can create a string iterator that iterates over a list of non-strings
	 * that will only become an error at runtime. The compiler doesn't catch this. 
	 */
	public void iterateJava5Generics() {
		List<String> things = initList();
		for(Iterator<String> i = things.iterator(); i.hasNext(); ) {
			String item = i.next();
			System.out.println(item);
		}
	}

	/**
	 * Runs both methods that iterate a list: using the deprecated way and in Java 5 way.  
	 * @param args arguments (not in use)
	 */
	public static void main(String [] args) {
		EnhancedGenerics eg = new EnhancedGenerics();
		System.out.println("a) Iterating a list in a deprecated way:");
		eg.iterateDeprecatedGenerics();
		System.out.println("b) Iterating a list in Java 5 way:");
		eg.iterateJava5Generics();
	}
}

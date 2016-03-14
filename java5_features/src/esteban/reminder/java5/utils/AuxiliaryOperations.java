package esteban.reminder.java5.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that provides auxiliary methods, i.e. to initialise variables.
 * 
 * @author estebangm
 */
public class AuxiliaryOperations {

	/*
	 * Auxiliary method that returns a list of Strings.
	 * @return list of strings
	 */
	public static List<String> initList() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("cheers!");
		list.add("have a nice day!");
		list.add("no way");
		return list;
	}
}

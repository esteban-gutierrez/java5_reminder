package esteban.reminder.java5.annotations;

/**
 * You can define your own annotations. They're basically like interfaces, but they can contain
 * values.
 * 
 * This annotation declares three members: what, when, location and sets them up to have "getters"
 * and "setters" automatically. That means each @Conference annotation has those three fields
 * associated with it, and I don't have to define the accessor and mutator methods to set them upç
 * (see method '' in class Annotations).
 * 
 * @author estebangm
 */
public @interface ConferenceAnnotation {
	String what();
	String when();
	String location();
}
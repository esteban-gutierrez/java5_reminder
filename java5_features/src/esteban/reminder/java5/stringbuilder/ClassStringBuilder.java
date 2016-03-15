package esteban.reminder.java5.stringbuilder;

/**
 * New class introduced in Java 5 that simplifies String management.
 * 
 * The class StringBuilder works essentially as an unsynchronized StringBuffer for performance
 * enhancement. You should replace all StringBuffer uses with StringBuilder unless you need the
 * synchronization (which you almost certainly don't).
 * sStringBuilder is almost always faster than StringBuffer.
 *
 * @author estebangm
 */
public class ClassStringBuilder {

	
	/**
	 * 
	 * 
	 * @param args arguments (not in use)
	 */
	public static void main(String[] args) {
        int N = 9999999;
        long t;

        StringBuffer sb = new StringBuffer();
        t = System.currentTimeMillis();
        for (int i = N; i --> 0 ;) {
            sb.append("a");
        }
        System.out.println("StringBuffer: " + (System.currentTimeMillis() - t));

        StringBuilder strb = new StringBuilder();
        t = System.currentTimeMillis();
        for (int i = N; i --> 0 ;) {
        	strb.append("a");
        }
        System.out.println("StringBuilder: " + (System.currentTimeMillis() - t));

        sb = new StringBuffer();
        t = System.currentTimeMillis();
        for (int i = N; i --> 0 ;) {
            sb.append("b");
        }
        System.out.println("StringBuffer: " + (System.currentTimeMillis() - t));

        strb = new StringBuilder();
        t = System.currentTimeMillis();
        for (int i = N; i --> 0 ;) {
        	strb.append("b");
        }
        System.out.println("StringBuilder: " + (System.currentTimeMillis() - t));

        sb = new StringBuffer();
        t = System.currentTimeMillis();
        for (int i = N; i --> 0 ;) {
            sb.append("c");
        }
        System.out.println("StringBuffer: " + (System.currentTimeMillis() - t));

        strb = new StringBuilder();
        t = System.currentTimeMillis();
        for (int i = N; i --> 0 ;) {
        	strb.append("c");
        }
        System.out.println("StringBuilder: " + (System.currentTimeMillis() - t));
    }
}

/**
 * 
 */

/**
 * @author elyaa
 *
 */
import java.net.*;
import java.io.*;
public class Class1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	         URL url = new URL("https://github.com/Reraed?tab=repositories");
	         
	         System.out.println("URL is " + url.toString());
		} catch (IOException e) {
	         e.printStackTrace();
		}
	}

}

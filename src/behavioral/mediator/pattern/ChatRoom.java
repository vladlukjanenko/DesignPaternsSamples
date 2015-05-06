/**
 * 
 */
package behavioral.mediator.pattern;

import java.util.Date;

/**
 * @author Vlad Lukjanenko
 *
 */
public class ChatRoom {
	
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
	
}

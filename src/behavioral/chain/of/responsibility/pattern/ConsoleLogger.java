/**
 * 
 */
package behavioral.chain.of.responsibility.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		this.level = level;
	}

	/* 
	 * @see behavioral.chain.of.responsibility.pattern.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}

}

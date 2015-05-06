/**
 * 
 */
package behavioral.chain.of.responsibility.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}

	/*
	 * @see
	 * behavioral.chain.of.responsibility.pattern.AbstractLogger#write(java.
	 * lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("File::Logger: " + message);
	}

}

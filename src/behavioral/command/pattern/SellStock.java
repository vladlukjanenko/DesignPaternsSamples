/**
 * 
 */
package behavioral.command.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class SellStock implements Order {

	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	/*
	 * @see behavioral.command.pattern.Order#execute()
	 */
	@Override
	public void execute() {
		abcStock.sell();
	}

}

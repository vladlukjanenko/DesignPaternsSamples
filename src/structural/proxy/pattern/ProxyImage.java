/**
 * 
 */
package structural.proxy.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	/* 
	 * @see structural.proxy.pattern.Image#display()
	 */
	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		
		realImage.display();
	}

}

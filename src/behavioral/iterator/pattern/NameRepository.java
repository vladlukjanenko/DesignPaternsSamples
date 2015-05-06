/**
 * 
 */
package behavioral.iterator.pattern;

/**
 * @author Vlad Lukjanenko
 *
 */
public class NameRepository implements Container {

	public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
	
	/*
	 * @see behavioral.iterator.pattern.Container#getIterator()
	 */
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {

		int index;
		
		/*
		 * @see behavioral.iterator.pattern.Iterator#hasNext()
		 */
		@Override
		public boolean hasNext() {
			
			if (index < names.length) {
				return true;
			}
			
			return false;
			
		}

		/* 
		 * @see behavioral.iterator.pattern.Iterator#next()
		 */
		@Override
		public Object next() {

			if (this.hasNext()) {
				return names[index++];
			}

			return null;
	
		}
		
	}
	
}

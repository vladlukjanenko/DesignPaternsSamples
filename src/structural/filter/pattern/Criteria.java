/**
 * 
 */
package structural.filter.pattern;

import java.util.List;

/**
 * @author Vlad Lukjanenko
 *
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}

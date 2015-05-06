/**
 * 
 */
package structural.filter.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vlad Lukjanenko
 *
 */
public class CriteriaSingle implements Criteria {

	/*
	 * @see filter.pattern.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}

}

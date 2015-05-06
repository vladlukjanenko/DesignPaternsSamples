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
public class CriteriaMale implements Criteria {

	/*
	 * @see filter.pattern.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();

		for (Person p : persons) {
			if (p.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(p);
			}
		}

		return malePersons;
	}

}

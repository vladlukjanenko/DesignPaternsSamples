/**
 * 
 */
package structural.filter.pattern;

import java.util.List;

/**
 * @author Vlad Lukjanenko
 *
 */
public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	/* 
	 * @see filter.pattern.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}

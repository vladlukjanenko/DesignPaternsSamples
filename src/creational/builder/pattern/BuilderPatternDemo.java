/**
 * 
 */
package creational.builder.pattern;

/**
 * @author Vlad Lukjanenko
 * =======================    Creational Pattern    =======================
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		// create MealBuilder
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost() + "\n");
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
		
	}
}

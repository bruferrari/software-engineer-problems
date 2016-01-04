import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that combines two lists by alternatingly taking elements. 
 * For example: given the two lists [a, b, c] and [1, 2, 3], 
 * the function should return [a, 1, b, 2, c, 3].
 * @author bruno
 * @from https://www.shiftedup.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
 */
public class Problem2 {

	private static List<Integer> numbers = new ArrayList<>();
	private static List<String> chars = new ArrayList<>();
	private static List<String> result = new ArrayList<>();
	
	private static void fillLists() {
		for(int i = 1; i <= 3; i++) {
			numbers.add(i);
		}
		
		chars.add("A");
		chars.add("B");
		chars.add("C");
	}
	
	public static void combine() {
		for(int i = 0; i < numbers.size(); i++) {
			result.add(String.valueOf(numbers.get(i)));
			result.add(chars.get(i));
		}
	}
	
	public static void main(String[] args) {
		fillLists();
		combine();
		System.out.println(result);
	}
}

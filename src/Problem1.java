import java.util.ArrayList;
import java.util.List;

/**
 * Write three functions that compute the sum of the numbers 
 * in a given list using a for-loop, a while-loop, and recursion.
 * @author bruno
 * @from https://www.shiftedup.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
 */
public class Problem1 {

	static List<Integer> numbers = new ArrayList<>();
	
	public static void fillList() {
		for(int i = 1; i <= 20; i++) {
			numbers.add(i);
		}
	}
	
	static int byForLoop() {
		int total = 0;
		
		for(int i = 0; i < numbers.size(); i++) {
			total += numbers.get(i);
		}
		
		return total;
	}
	
	static int byWhileLoop() {
		int total = 0;
		int i = 0;
		
		while(i < numbers.size()) {
			total += numbers.get(i);
			i++;
		}
		
		return total;
	}
	
	static int byRecursion(int size) {
		if(size == 0) {
			return numbers.get(size);
		} else {
			return numbers.get(size) + byRecursion(size - 1);
		}
	}

	public static void main(String[] args) {
		fillList();
		int totalFor = byForLoop();
		int totalWhile = byWhileLoop();
		int totalRecursion = byRecursion(numbers.size() - 1);
		
		System.out.println(totalFor + " " + totalWhile + " " + totalRecursion);
	}
}

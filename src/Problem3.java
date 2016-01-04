import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that computes the list of the first 100 Fibonacci numbers. 
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two. 
 * As an example, here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 * @author bruno
 * @from https://www.shiftedup.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
 */
public class Problem3 {

	public static List<Long> computeFibonnaci() {
		List<Long> f = new ArrayList<>();
		f.add(0L);
		f.add(1L);
		
		for(int i = 2; i < 100; i++) {
			int result = (int) (f.get(i-1) + f.get(i-2));
			f.add((long) result);
		}
		
		return f;
	}
	
	public static void main(String[] args) {
		System.out.println(computeFibonnaci());
	}
}

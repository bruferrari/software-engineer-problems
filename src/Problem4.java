import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Write a function that given a list of non negative integers, arranges them such that they form the largest possible number. 
 * For example, given [50, 2, 1, 9], the largest formed number is 95021.
 * @author bruno
 * @from https://www.shiftedup.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
 */
public class Problem4 {

	static Integer numbers[] = {50, 9, 6, 3};
	
	public static void main(String[] args) {
		Arrays.sort(numbers, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String v1 = o1.toString();
				String v2 = o2.toString();
				
				return (v1 + v2).compareTo(v2 + v1) * -1;
			}
		});
		
		String result = "";
		for(Integer i : numbers) {
			result += i.toString();
		}
		
		System.out.println(result);
	}
}

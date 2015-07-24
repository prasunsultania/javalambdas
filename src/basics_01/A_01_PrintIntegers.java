package basics_01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 
 * @author prasunsultania
 *
 */
public class A_01_PrintIntegers {
	
	public static void main(String[] args){
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		
		//x->syso(x) is a lambda expression
		//LHS is the arguments on which it operates
		//RHS is the function body, it can be a single statement or a block as well
		integers.forEach(x->System.out.println(x));
	}
}

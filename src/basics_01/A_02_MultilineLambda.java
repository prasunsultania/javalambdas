package basics_01;

import java.util.Arrays;
import java.util.List;

/**
 * This example focus on syntax where lambda function body is multiLine
 * @author prasunsultania
 *
 */
public class A_02_MultilineLambda {
	
	public static void main(String[] args){
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		
		integers.forEach(x->{
			x = x+ 10;
			System.out.println(x);
		});
	}
}

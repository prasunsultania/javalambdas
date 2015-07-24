package basics_01;

import java.util.Arrays;
import java.util.List;

public class A_03_ParameterType {
	
	public static void main(String[] args){
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		
		//in LHS of lambda you can specify the param type explicitly
		//in many cases you dont need to as compiler makes out on its own
		integers.forEach((Integer x)->{
			x = x+ 10;
			System.out.println(x);
		});
	}
}

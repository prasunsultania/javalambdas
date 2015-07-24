package existingmethodref_06;

import java.util.function.Function;

public class RefConstructor {
	
	public static void main(String[] args) {
		
		Function<String, Integer> integerConstructor = x -> new Integer(x);
		System.out.println(integerConstructor.apply("23"));
		
		Function<String, Integer> integerConstructor2 = Integer::new;
		System.out.println(integerConstructor2.apply("23"));
	}
	
}

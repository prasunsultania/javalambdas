package existingmethodref_06;

import java.util.function.Consumer;

public class StaticRef {
	
	public static void doSomething(Integer x){
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		//holds a static reference
		Consumer<Integer> consumer1 = x -> doSomething(x);
		consumer1.accept(5);
		
		//holds lambda reference for a static function
		Consumer<Integer> consumer2 = StaticRef::doSomething;
		consumer2.accept(6);
		
		//syntax #2 is better
	}
}

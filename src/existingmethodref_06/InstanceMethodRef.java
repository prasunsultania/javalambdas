package existingmethodref_06;

import java.util.function.Consumer;

/**
 * This class is about getting lambda reference to objects 
 * @author prasunsultania
 *
 */
public class InstanceMethodRef {
	
	public void existingMethod(String e){
		System.out.println(e); 
	}
	
	public void existingMethodNoParam(){
		System.out.println("no param");
	}
	
	public static void main(String[] args) {
		InstanceMethodRef instanceMethodRef = new InstanceMethodRef();
		
		//Get reference to an instance method
		Consumer<String> consumer1 = instanceMethodRef::existingMethod;
		consumer1.accept("hey");
		
		//Obviously, syntax above is more cool
		Consumer<String> consumer2 = x -> instanceMethodRef.existingMethod(x);
		consumer2.accept("hey again");
		
		//get lambda reference to an object's methods (not binded to any instance)
		Consumer<InstanceMethodRef> consumer3 = (imr)->imr.existingMethod("5");
		consumer3.accept(instanceMethodRef);
		
		//parameterized methods cannot be defined this way
		//that being said, parameterized methods cannot be taken up using :: for object methods
		Consumer<InstanceMethodRef> consumer4 = InstanceMethodRef::existingMethodNoParam;
		consumer4.accept(new InstanceMethodRef());
	}
	
}

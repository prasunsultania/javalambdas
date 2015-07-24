package functionainterface_02;


/**
 * An interface with only one function
 * @author prasunsultania
 *
 */
public class FunctionalInterface {
	
	public static void main(String[] args){
		AnArrayList integers = new AnArrayList();
		integers.add(1);
		integers.add(2);
		
		//Interface type holds the lambda
		Consumer<Integer> consumer = x->System.out.println(x);
		//passing the lambda via a local variable
		integers.forEach(consumer);
		
		//this one compiles
		integers.forEach((Integer x)->System.out.println(x));
		
		//below one doesnt compiles, compiler is not getting a type guarantee
		//integers.forEach(x->System.out.println(x));
	}
	
}

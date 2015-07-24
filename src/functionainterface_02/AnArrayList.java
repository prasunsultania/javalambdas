package functionainterface_02;

import java.util.ArrayList;

/**
 * 
 * @author prasunsultania
 *
 */
public class AnArrayList extends ArrayList<Integer>{
	/**
	 * Lambda is declared as an argument
	 * Functional interface type becomes the Type holder for Lambda
	 * We want a Lamba function as an argument
	 * @param action
	 */
	public void forEach(Consumer<Integer> action){
		for(Object i: this.toArray()){
			//the definition of accept will come from a lambda
			//which can be defined dynamically
			action.accept((Integer)i);
		}
	}
}

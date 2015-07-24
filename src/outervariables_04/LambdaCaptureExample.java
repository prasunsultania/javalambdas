package outervariables_04;

import java.util.Arrays;
import java.util.List;

public class LambdaCaptureExample {
	private static int svar = 9;
	private static final LambdaCaptureExample INSTANCE = new LambdaCaptureExample();
	
	public void doSomething(){
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		
		int var = 10;
		//Lambdas can access outer scope's local variables
		integers.forEach(x->System.out.println(x + var));
		
		integers.forEach(x->{
			//var++; //outer variables cannot be changed //should be final or effectively final
			System.out.println(x + var);
			
			svar++; //static ones can be accessed and modified
			System.out.println(svar);
			
			//this points to the scope of enclosing class/method
			if(this == INSTANCE){
				System.out.println("INSTANCE is instance");
			}
		});
	}
	
	public static void main(String[] args) {
		INSTANCE.doSomething();
	}
}

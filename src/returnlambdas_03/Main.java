package returnlambdas_03;

public class Main {
	
	/**
	 * A method that returns a Lambda
	 * Note Lambda type is automatically type casted to its Functional interface
	 * @return
	 */
	public static PasswordEncoder makeBadEncoder(){
		return (password, salt) -> password.toUpperCase();
	}
	
	public static void doSomething(PasswordEncoder encoder){
		String salted = encoder.encode("abc", "123");
	}
	
	public static void main(String[] args) {
		//collect the lambda
		PasswordEncoder encoder = makeBadEncoder();
		//pass the lambda
		doSomething(encoder);
	}
}

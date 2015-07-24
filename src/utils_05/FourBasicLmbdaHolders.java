package utils_05;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FourBasicLmbdaHolders {
	public static void main(String[] args) {
		
		//Consumer util takes an argument and returns void
		Consumer c = x -> System.out.println(x);
		c.accept(1);
		Consumer<Integer> cc = (Integer x) -> System.out.println(x);
		cc.accept(2);
		
		//Supplier takes nothing but, returns T
		Supplier s = () -> {return "you";};
		System.out.println("suppiler s:: " + s.get());
		Supplier<Integer> i = () -> {return 5;};
		System.out.println("supplier i::" + i.get());
		
		//Takes T and returns true
		Predicate p = (x) -> { return ((Integer)x < 5);};
		System.out.println("predicate ::" + p.test(5));
		Predicate<String> ps = (x) -> { return x.contains("5");};
		System.out.println("predicate ::" + ps.test("5me"));
		Predicate<String> ps2 = (String x) -> {return x.contains("5");};
		System.out.println("predicate ::" + ps.test("5me"));
		
		//Take an argument and return another
		Function f = (x) -> {return 2 + (Integer)x;};
		Function<Integer, Integer> f2 = (x) -> { return x+2;};
		System.out.println("function ::" + f.apply(5));
		System.out.println("function ::" + f2.apply(5));
	}
}

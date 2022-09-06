package lamda.func.interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoFuncInterfaces {
	
	public static void main(String[] args) {
		Predicate<Integer> isEven = (number)->{
			if(number %2 == 0) {
				return true;
			}
			else {
				return false;
			}
		};
		
		Predicate<Integer> isOdd = (num) -> {return (num%2 == 0) ? false : true;};
		
	System.out.println(isEven.test(3));
	System.out.println(isOdd.test(4));
	
	Function<String, Integer> strLen = (str) -> {return str.length();};
	System.out.println(strLen.apply("synchronoss"));
	
	Consumer<String> greet = (str)->{System.out.println("welcome "+str);};
	greet.accept("ansar");
	
	Supplier<Integer> otpSupplier = ()-> {return 98765;};
	System.out.println("otp is"+ otpSupplier.get());
	}

}

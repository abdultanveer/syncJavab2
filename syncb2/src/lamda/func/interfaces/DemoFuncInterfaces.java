package lamda.func.interfaces;

import java.util.function.Predicate;

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
	}

}

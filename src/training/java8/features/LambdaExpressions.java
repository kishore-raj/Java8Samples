package training.java8.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
/**
 * 
 * Lambda can be used to easily instantiate functional interfaces, 
 * since functional interfaces has only one abstract method in it.
 */
public class LambdaExpressions {
	
	protected String s ;
	
	public static Function<String, String> fun =  (String x) ->{x= x+"23";
	return x;
	};
	
	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
	    return numbers.parallelStream()
	    		.filter(predicate)
	    		.mapToInt(i -> i)
	    		.sum();
	}

	
	public static int findSquareOfMaxOdd(List<Integer> numbers) {
		return numbers.stream()
				.filter(LambdaExpressions::isOdd) 		//Predicate is functional interface and
				.filter(LambdaExpressions::isGreaterThan3)	// we are using lambdas to initialize it
				.filter(LambdaExpressions::isLessThan11)	// rather than anonymous inner classes
				.max(Comparator.naturalOrder())
				.map(i -> i * i)
				.get();
	}

	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}
	
	public static boolean isGreaterThan3(int i){
		return i > 3;
	}
	
	public static boolean isLessThan11(int i){
		return i < 11;
	}
	public static void main(String[] args) {


		
		/**
		 * Functional interface use Example-----------------------------------------------------------------------------
		 */
		//<Functional Interface> <instance> = (<arguments for abstract method>) ->{implementation};  
		InterfaceWithMethodImplementation i1  =  (s) -> { System.out.println(s);};

		i1.print("Lambda with functional interface");

	
		
		/**
		 * Predicate Example-----------------------------------------------------------------------------
		 */
		Predicate<String> predicate = value -> (value =="kishore");
		//							  variable -> (condition)								
		predicate = predicate.negate();
		System.out.println(predicate.test("kishore"));
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		sumWithCondition(numbers, n -> true);//sum of all numbers
		
		sumWithCondition(numbers, i -> i%2==0);//sum of all even numbers
	
		sumWithCondition(numbers, i -> i>5);//sum of all numbers greater than 5
		

		 
		/**
		 * double colon (::) operator-----------------------------------------------------------------------------
		 */
		findSquareOfMaxOdd(numbers);
		
		/**
		 * Function Example-----------------------------------------------------------------------------
		 */
		System.out.println(fun.apply("kishore"));
		
	}
	
}

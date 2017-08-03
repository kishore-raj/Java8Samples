package training.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/**
 * 
 * 
 * forEach method in java.lang.Iterable interface so that while writing code we focus on business logic only. forEach method takes java.util.function.Consumer object as argument, so it helps in having our business logic at a separate location that we can reuse. Let’s see forEach usage with simple example.
 * @author kishoreraj
 *
 */
public class ForEachIterator {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("one", "two", "three");

		strings.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
		});
	}

	
//	//Consumer implementation that can be reused
//	class MyConsumer implements Consumer<Integer>{
//
//		public void accept(Integer t) {
//			System.out.println("Consumer impl Value::"+t);
//		}
//
//
//	}
}

package training.java8.features;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.logging.Logger;

@FunctionalInterface
public interface InterfaceWithMethodImplementation {

	
	/**
	 * An interface with exactly one abstract method becomes Functional Interface. 
	 * We don’t need to use @FunctionalInterface annotation to mark an interface as F
	 * unctional Interface. @FunctionalInterface annotation is a facility to avoid 
	 * accidental addition of abstract methods in the functional interfaces. 
	 * You can think of it like @Override annotation and it’s best practice to use it. 
	 * java.lang.Runnable with single abstract method run() is a 
	 * great example of functional interface.
	 *  */
	
	void print(String str);


	
	public static void log (String logMessage) {
		Logger.getLogger("check").warning(logMessage);
	}
	
	default public int add(int value1, int value2) {
		return value1+value2;
	}
	
	default void forEach(Consumer<? super String> action) {
        Objects.requireNonNull(action);
        for (String t : Arrays.asList("as")) {
            action.accept(t);
        }
	}
}

	

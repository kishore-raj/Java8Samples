package training.java8.features;


/**
 * We can use default and static keyword to create interfaces with method implementation. forEach method implementation in Iterable interface is:
 * @author Kishoreraj
 *
 */
public class InterfaceWithMethodImplementationTester implements InterfaceWithMethodImplementation {

	
	public static void main(String[] args) {
		InterfaceWithMethodImplementationTester tester = new InterfaceWithMethodImplementationTester();
		System.out.println(tester.add(1, 2));
		InterfaceWithMethodImplementation.log("logging feature");
	}

	@Override
	public void print(String str) {
		// TODO Auto-generated method stub
		
	}
}

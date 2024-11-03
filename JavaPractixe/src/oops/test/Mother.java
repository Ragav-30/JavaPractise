package oops.test;

public interface Mother extends Aunt {

	default void sayHello() {
		System.out.println("Hellpp from mom interface");

	}
}

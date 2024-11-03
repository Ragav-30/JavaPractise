package oops.test;

public interface Aunt {
	void Guessme();

	default void sayHello() {
		System.out.println("Im ur aunt kid from aunt class");
	}
}

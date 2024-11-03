package oops.test;

public class Child extends Father implements Mother, Aunt {

//		System.out.println("Im not from interface");}

	@Override
	public void whoAmI() {
		// TODO Auto-generated method stub
		System.out.println("I am ur child dad from child class");
	}

	public void Iam() {
		System.out.println("Iam the child");
	}

	@Override
	public void Guessme() {
		// TODO Auto-generated method stub
		System.out.println("i am ur aunt da from child class");
	}

}

package oops.test;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		f.whoAmI();
		// f.sayHello();
		Child m = new Child();
		m.whoAmI();
		m.Iam();
		m.sayHello();
		Father n = new Child();
		n.whoAmI();
		// n.sayHello();

	}

}

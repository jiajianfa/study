package stu.design.decorator;

public class Test {

	public static void main(String[] args) {
		Sourceable sourceable = new Decorator(new Source());
		sourceable.method();

	}

}

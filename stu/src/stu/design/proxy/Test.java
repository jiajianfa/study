package stu.design.proxy;

import stu.design.decorator.Source;
import stu.design.decorator.Sourceable;

public class Test {
	
	public static void main(String[] args) {
		Sourceable sourceable = new Proxy(new Source());
		sourceable.method();
	}

}

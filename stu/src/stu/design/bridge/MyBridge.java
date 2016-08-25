package stu.design.bridge;

public class MyBridge extends Bridge {
	
	@Override
	public void method() {
		getSourceable().method();
	}

}

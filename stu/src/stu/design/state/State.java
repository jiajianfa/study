package stu.design.state;

/**
 * 状态类的核心类
 * 
 * State
 * 
 * lijq
 * 2016年8月3日 上午10:31:13
 * 
 * @version 1.0.0
 *
 */
public class State {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void method1() {
		System.out.println("execute the first opt!");
	}

	public void method2() {
		System.out.println("execute the second opt!");
	}
}
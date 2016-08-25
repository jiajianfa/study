package stu.design.state;

/**
 * 状态模式的切换类
 * 
 * Context
 * 
 * lijq 2016年8月3日 上午11:04:14
 * 
 * @version 1.0.0
 *
 */
public class Context {

	private State state;

	public Context(State state) {
		this.state = state;
	}

	public void method() {
		if (state.getValue().equals("state1")) {
			state.method1();
		} else if (state.getValue().equals("state2")) {
			state.method2();
		}
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}

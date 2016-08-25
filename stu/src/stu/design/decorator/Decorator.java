package stu.design.decorator;

/**
 * 装饰者
 * 
 * Decorator
 * 
 * lijq
 * 2016年7月27日 下午3:44:22
 * 
 * @version 1.0.0
 *
 */
public class Decorator implements Sourceable {
	
	private Sourceable source;
	
	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");
		source.method();
		System.out.println("after decorator!");
	}

}

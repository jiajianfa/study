package stu.design.adapter;

/**
 * 对象适配器模式
 * 
 * Wrapper
 * 
 * lijq
 * 2016年7月27日 上午10:55:09
 * 
 * @version 1.0.0
 *
 */
public class Wrapper implements Targetable {
	
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
		
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");  
	}

}

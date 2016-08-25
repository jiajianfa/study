package stu.design.decorator;

/**
 * 被装饰类
 * 
 * Source
 * 
 * lijq
 * 2016年7月27日 下午3:21:25
 * 
 * @version 1.0.0
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the Source original method!");

	}

}

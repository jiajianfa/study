package stu.design.adapter;

/**
 * 待适配的类
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，目
 * 标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * 
 * Source
 * 
 * lijq
 * 2016年7月27日 上午10:31:41
 * 
 * @version 1.0.0
 *
 */
public class Source {

	public void method1() {
		System.out.println("this is original method1!");
	}
}
package stu.design.adapter;

/**
 * 类适配器
 * 
 * Adapter
 * 
 * lijq
 * 2016年7月27日 上午10:36:22
 * 
 * @version 1.0.0
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method2!"); 
	}

}

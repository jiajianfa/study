package stu.design.adapter.abs;

/**
 * 
 * 借助于一个抽象类，该抽象类实现了该接口，实现了所有的方法，而
 * 我们不和原始的接口打交道，
 * 只和该抽象类取得联系，所以我们写一个类，继承该抽象类，
 * 重写我们需要的方法就行
 * Wrapper2
 * 
 * lijq
 * 2016年7月27日 下午2:26:15
 * 
 * @version 1.0.0
 *
 */
public abstract class Wrapper2 implements Sourceable {
	
	public void method1(){};
	public void method2(){};
	public void method3(){};

}

package stu.design.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		/**
		 * 类适配器模式
		 */
//		Targetable target = new Adapter();  
//        target.method1();  
//        target.method2(); 
		
		/**
		 * 对象适配器
		 */
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();

	}

}

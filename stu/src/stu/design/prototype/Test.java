package stu.design.prototype;

import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Prototype pro = new Prototype();
//		pro.setName("original object");
//		Prototype clonePro = (Prototype) pro.clone();
//		pro.setName("changed object1");
//		System.out.println("original object:" + pro.getName());
//		System.out.println("cloned object:" + clonePro.getName());
		
		pro.setName("初始化");
		Prototype clonePro = (Prototype) pro.deepClone();
		pro.setName("修改");
		System.out.println("original object:" + pro.getName());
		System.out.println("cloned object:" + clonePro.getName());
		
	}

}

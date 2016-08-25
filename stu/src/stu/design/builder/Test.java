package stu.design.builder;

import java.util.List;

import stu.design.factory.Sender;

public class Test {

	public static void main(String[] args) {
		Builder builder = new Builder();
		List<Sender> list = builder.produceMailSender(10);
		System.out.println(list.toString());
	}

}

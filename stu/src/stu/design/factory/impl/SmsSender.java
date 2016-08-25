package stu.design.factory.impl;

import stu.design.factory.Sender;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("this is sms sender");

	}

}

package stu.design.factory.abstractFactory;

import stu.design.factory.Sender;
import stu.design.factory.impl.SmsSender;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}

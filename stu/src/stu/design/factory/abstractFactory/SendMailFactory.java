package stu.design.factory.abstractFactory;

import stu.design.factory.Sender;
import stu.design.factory.impl.MailSender;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}

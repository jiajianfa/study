package stu.design.factory;

public class FactoryTest {

	public static void main(String[] args) {
//		SendFactory factory = new SendFactory();
//		Sender sender = factory.produce("sms");
		Sender sender = SendFactory.produceMail();
		sender.send();

	}

}

package stu.design.factory;

import stu.design.factory.impl.MailSender;
import stu.design.factory.impl.SmsSender;

/**
 * 静态工厂模式适合：凡是出现了大量的产品需要创建，
 * 并且具有共同的接口时，可以通过工厂方法模式进行创建。
 * SendFactory
 * 
 * lijq 2016年7月25日 下午5:05:41
 * 
 * @version 1.0.0
 *
 */
public class SendFactory {

	/**
	 * 创建对象 produce
	 * 
	 * @param type
	 * @return Sender
	 * @exception @since
	 *                1.0.0
	 */
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确类型");
			return null;
		}
	}

	/**
	 * 优化后的工厂模式
	 * produceMail
	 * @return 
	 * Sender
	 * @exception 
	 * @since  1.0.0
	 */
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSms() {
		return new SmsSender();
	}

}

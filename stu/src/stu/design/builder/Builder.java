package stu.design.builder;

import java.util.ArrayList;
import java.util.List;

import stu.design.factory.Sender;
import stu.design.factory.impl.MailSender;
import stu.design.factory.impl.SmsSender;

/**
 * 
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则
 * 是将各种产品集中起来进行管理，用来创建复合对象，所谓
 * 复合对象就是指某个类具有不同的属性
 * Builder
 * 
 * lijq
 * 2016年7月26日 下午2:15:57
 * 
 * @version 1.0.0
 *
 */
public class Builder {
	
	private List<Sender> list = new ArrayList<Sender>();
	
	public List<Sender> produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
		return list;
	}
	
	public List<Sender> produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
		return list;
	}

}

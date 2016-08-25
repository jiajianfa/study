package stu.design.mediator;

/**
 * User抽象类，与中介关联
 * 
 * User
 * 
 * lijq
 * 2016年8月4日 下午2:09:07
 * 
 * @version 1.0.0
 *
 */
public abstract class User {

	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public User(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void work();
}
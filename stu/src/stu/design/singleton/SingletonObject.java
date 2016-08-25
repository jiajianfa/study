package stu.design.singleton;

/**
 * 单例模式
 * 
 * SingletonObject
 * 
 * lijq
 * 2016年7月26日 上午11:28:32
 * 
 * @version 1.0.0
 *
 */
public class SingletonObject {
	
	private static SingletonObject instance = null;
	
	private SingletonObject(){
		
	}
	
	/**
	 * 同步初始化
	 * syncInit 
	 * void
	 * @exception 
	 * @since  1.0.0
	 */
	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new SingletonObject();
		}
	}
	
	public static SingletonObject getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}

}

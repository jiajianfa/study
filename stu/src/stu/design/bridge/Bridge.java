package stu.design.bridge;

/**
 * 定义一个桥，持有Sourceable的一个实例：
 * 
 * Bridge
 * 
 * lijq
 * 2016年7月28日 上午9:35:50
 * 
 * @version 1.0.0
 *
 */
public abstract class Bridge {
	
	private Sourceable sourceable;
	
	public void method() {
		sourceable.method();
	}

	public Sourceable getSourceable() {
		return sourceable;
	}

	public void setSourceable(Sourceable sourceable) {
		this.sourceable = sourceable;
	}
	
	

}

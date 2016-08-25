package stu.design.memento;

/**
 * 原始类
 * 
 * Original
 * 
 * lijq
 * 2016年8月1日 下午4:06:32
 * 
 * @version 1.0.0
 *
 */
public class Original {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value) {
		this.value = value;
	}

	/**
	 * 初始化备忘内容
	 * createMemento
	 * @return 
	 * Memento
	 * @exception 
	 * @since  1.0.0
	 */
	public Memento createMemento() {
		return new Memento(value);
	}

	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
	}
}
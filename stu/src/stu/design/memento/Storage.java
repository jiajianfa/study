package stu.design.memento;

/**
 * 
 * Storage类是存储备忘录的类，持有Memento类的实例
 * Storage
 * 
 * lijq
 * 2016年8月1日 下午5:22:44
 * 
 * @version 1.0.0
 *
 */
public class Storage {

	private Memento memento;

	public Storage(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
package stu.design.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {
	
	private Vector<Observer> vector = new Vector<>();
	
	@Override
	public void add(Observer observer) {
		vector.addElement(observer);
		
	}
	
	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}
	
	/**
	 * 通知所有订阅者
	 */
	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			enumeration.nextElement().update();
		}
	}
	
}

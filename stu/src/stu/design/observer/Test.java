package stu.design.observer;

public class Test {
	
	public static void main(String[] args) {
		Subject subject = new MySubject();
		subject.add(new ObserverImplOne());
		subject.add(new ObserverImplTwo());
		subject.operation();
	}

}

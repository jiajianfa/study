package stu.design.iterator;

public class MyCollection implements Collection {
	
	public String[] english = {"A","B","C","D","E"};

	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public Object get(int i) {
		return english[i];
	}

	@Override
	public int size() {
		return english.length;
	}

}

package com.zero.threadTest;

//线程共享数据，4个线程，两个-，两个+
public class MutiThreadshareData {
	
	
	public static void main(String[] args) {
		
		final ShareData data = new ShareData();
		
		new Thread(new MyRunnable(data)).start();
		new Thread(new MyRunnable2(data)).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				data.increament();
				System.out.println(data.getJ());
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				data.add();
				System.out.println(data.getJ());
			}
		}).start();
	}

}

class ShareData {

	private int j = 0;

	public synchronized void increament() {
		j--;
	}

	public synchronized void add() {
		j++;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

}

class MyRunnable implements Runnable {
	
	private ShareData shareData;
	public MyRunnable(ShareData shareData) {
		this.shareData = shareData;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		shareData.add();
	}
	
}

class MyRunnable2 implements Runnable {
	
	private ShareData shareData;
	public MyRunnable2(ShareData shareData) {
		this.shareData = shareData;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		shareData.increament();
	}
	
}
package ch050.deadlock;

/**
 * 演示死锁
 * 
 * @author 程序猿大头
 *
 */
public class Resource {
	private int a;
	private Resource friend;

	public void setResource(Resource resource) {
		this.friend = resource;
	}

	public synchronized void add() {
		a++;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		friend.sub();
		System.out.println(Thread.currentThread().getName() + " : " + "add");
	}

	public synchronized void sub() {
		a--;
		System.out.println(Thread.currentThread().getName() + " : " + "sub");
	}
}

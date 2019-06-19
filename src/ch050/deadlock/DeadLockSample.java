package ch050.deadlock;

/**
 * 演示死锁
 * 
 * @author 程序猿大头
 *
 */
public class DeadLockSample extends Thread {

	private Resource resource;

	public DeadLockSample(Resource resource) {
		this.resource = resource;
		start();
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			resource.add();
		}
	};

	public static void main(String[] args) {
		Resource res1 = new Resource();
		Resource res2 = new Resource();
		res1.setResource(res2);
		res2.setResource(res1);
		DeadLockSample s1 = new DeadLockSample(res1);
		DeadLockSample s2 = new DeadLockSample(res2);
	}

}

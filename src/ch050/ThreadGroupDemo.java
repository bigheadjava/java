package ch050;

/**
 * 演示线程组
 * @author 程序猿大头
 *
 */
public class ThreadGroupDemo extends Thread {

	public ThreadGroupDemo(ThreadGroup group, String name) {
		super(group, name);
		start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(currentThread().getName() + " : " + i);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("myThreadGroup");
		for (int i = 0; i < 5; i++) {
			new ThreadGroupDemo(group, "myThread" + i);
		}
		
		int activeCount = group.activeCount();
		System.out.println("当前还活着的线程个数是: " + activeCount);
		Thread[] tArrays = new Thread[activeCount];
		group.enumerate(tArrays);
		for(Thread t : tArrays) {
			System.out.println(t.getName() + "还活着...");
		}
	}

}

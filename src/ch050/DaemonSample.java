package ch050;

/**
 * 演示设置后台线程
 * 
 * @author 程序猿大头
 *
 */
public class DaemonSample extends Thread {
	private int a;
	private static int count;

	@Override
	public synchronized void start() {
		super.start();
		Thread daemon = new Thread() { // 匿名类
			@Override
			public void run() {
				System.out.println(currentThread().getName() + " : a = " + a);
				// 每隔1秒把成员变量a的值设为0
				while (true) {
					reset();
					try {
						sleep(2);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		daemon.setName("daemon");
		daemon.setDaemon(true);
		daemon.start();
	}

	private void reset() {
		System.out.println("daemon调用reset方法...");
		a = 0;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(currentThread().getName() + " : " + a++); // 获取当前线程名字
			if (count++ == 200) {
				break;
			}
			yield();
		}
	}

	public static void main(String[] args) {
		DaemonSample ds = new DaemonSample();
		ds.setName("ds");
		ds.start();
	}

}

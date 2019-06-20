package ch050.thread_local;

/**
 * 演示ThreadLocal用法
 * 
 * @author 程序猿大头
 *
 */
public class Demo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			int a = ThreadCounter.get();
			System.out.println(getName() + " : " + a);
			ThreadCounter.set(a += 2);
		}
	}

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		d1.start();
		d2.start();
	}

}

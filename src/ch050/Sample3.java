package ch050;

/**
 * 演示正确的覆盖Thread类中的start方法
 * 
 * @author 程序猿大头
 *
 */
public class Sample3 extends Thread {

	private int a = 1;
	private static int count = 0;

	@Override
	public synchronized void start() {
		super.start();
		System.out.println(currentThread().getName() + ": 第" + (++count) + "个Sample3线程启动...");
	}

	@Override
	public void run() {
		while (a <= 50) {
			System.out.println(currentThread().getName() + " : a = " + a);
			a++;
		}
	}

	public static void main(String[] args) {
		Sample3 s1 = new Sample3();
		Sample3 s2 = new Sample3();
		s1.start(); // 第一个Sample3线程
		s2.start(); // 第二个Sample3线程
	}

}

package ch050;

/**
 * 演示错误的覆盖Thread类中的start方法
 * 
 * @author 程序猿大头
 *
 */
public class Sample2 extends Thread {

	private int a = 1;

	@Override
	public synchronized void start() {
		run();
	}

	@Override
	public void run() {
		while (a <= 50) {
			System.out.println(currentThread().getName() + " : a = " + a);
			a++;
		}
	}

	public static void main(String[] args) {
		Sample2 s = new Sample2();
		s.start(); // Sample1线程
		s.run(); // 主线程
	}

}

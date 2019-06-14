package ch050;

/**
 * 演示线程执行
 * 
 * @author 程序猿大头
 *
 */
public class Sample extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("自定义线程: " + i);
		}
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("主线程: " + i);
		}
	}

}

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
			System.out.println(currentThread().getName() + " : " + i); //获取当前线程
		}
	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
		s1.start(); // 线程1
		s2.start(); // 线程2
		s3.run(); // 主线程

	}

}

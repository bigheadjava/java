package ch050.dispatch;

/**
 * 演示线程sleep的时候被打断
 * 
 * @author 程序猿大头
 *
 */
public class Sample4 extends Thread {

	@Override
	public void run() {
		int a = 1;
		try {
			sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(currentThread().getName() + "睡眠被打断, 发生异常...");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Sample4 s1 = new Sample4();
		s1.start();
		Thread.sleep(50);
		s1.interrupt(); // 终端线程s1的睡眠
	}

}

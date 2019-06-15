package ch050.dispatch;

import java.io.IOException;

/**
 * 演示线程的join()方法
 * 
 * @author 程序猿大头
 *
 */
public class Sample6 extends Thread {

	@Override
	public void run() {
		int a = 1;
		while (a <= 50) {
			System.out.println(currentThread().getName() + " : a = " + a);
			a++;
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Sample6 s1 = new Sample6();
		s1.setName("T1");
		s1.start();
		System.out.println("main: join s1");
		s1.join(); //主线程等到T1线程运行完毕才恢复运行
		System.out.println("main end");
	}

}

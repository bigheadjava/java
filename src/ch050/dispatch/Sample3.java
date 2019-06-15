package ch050.dispatch;

import java.io.IOException;

/**
 * 演示线程的sleep()方法
 * 
 * @author 程序猿大头
 *
 */
public class Sample3 extends Thread {
	private static StringBuffer sb = new StringBuffer();

	@Override
	public void run() {
		int a = 1;
		while (a <= 10) {
				sb.append(currentThread().getName()+" | ");
			a++;
			try {
				sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Sample3 s1 = new Sample3();
		Sample3 s2 = new Sample3();
		s1.setName("T1");
		s2.setName("T2");
		s1.start();
		s2.start();
		Thread.sleep(3000); //主线程睡眠3000ms，等待它t1和t2线程运行结束
		System.out.println(sb);
	}

}

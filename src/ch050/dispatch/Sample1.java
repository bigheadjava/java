package ch050.dispatch;

import java.io.IOException;

/**
 * 演示线程调度不是分时的，同时启动多个线程，JVM不能保证各个线程轮流或的均等的CPU时间片
 * 
 * @author 程序猿大头
 *
 */
public class Sample1 extends Thread {
	private static StringBuffer sb = new StringBuffer();

	@Override
	public void run() {
		int a = 1;
		while (a <= 10) {
			System.out.println(currentThread().getName() + " : a = " + a);
			sb.append(currentThread().getName()+" | ");
			a++;
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Sample1 s1 = new Sample1();
		Sample1 s2 = new Sample1();
		s1.setName("t1");
		s2.setName("t2");
		s1.start();
		s2.start();
		while(s1.isAlive() || s2.isAlive()) {
			Thread.sleep(500); //主线程睡眠500ms，等待它t1和t2线程运行结束
		}
		System.out.println(sb);
	}

}

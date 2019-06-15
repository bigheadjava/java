package ch050.dispatch;

import java.io.IOException;

/**
 * 演示线程的yield()方法 
 * 
 * @author 程序猿大头
 *
 */
public class Sample5 extends Thread {
	private static StringBuffer sb = new StringBuffer();

	@Override
	public void run() {
		int a = 1;
		while (a <= 10) {
			sb.append(currentThread().getName()+" | ");
			yield();
			a++;
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Sample5 s1 = new Sample5();
		Sample5 s2 = new Sample5();
		s1.setName("T1");
		s2.setName("T2");
		s1.start();
		s2.start();
		Thread.sleep(1000); //主线程睡眠1000ms，等待它t1和t2线程运行结束
		System.out.println(sb);
	}

}

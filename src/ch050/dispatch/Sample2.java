package ch050.dispatch;

import java.io.IOException;

/**
 * 演示线获取和设置线程的优先级
 * 
 * @author 程序猿大头
 *
 */
public class Sample2 extends Thread {
	private static StringBuffer sb = new StringBuffer();

	@Override
	public void run() {
		int a = 1;
		while (a <= 200) {
			if(a%10 == 0)
				sb.append(currentThread().getName()+" | ");
			a++;
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Sample2 s1 = new Sample2();
		Sample2 s2 = new Sample2();
		Sample2 s3 = new Sample2();
		s1.setName("t1");
		s2.setName("t2");
		s3.setName("t3");
		Thread main = Thread.currentThread(); //获得主线程
		//打印线程优先级
		System.out.println("主线程的优先级: " + main.getPriority());
		System.out.println("s1线程的优先级: " + s1.getPriority());
		System.out.println("s2线程的优先级: " + s2.getPriority());
		System.out.println("s3线程的优先级: " + s3.getPriority());
		
		s1.setPriority(MIN_PRIORITY);
		s2.setPriority(MAX_PRIORITY);
		s3.setPriority(MAX_PRIORITY);
		
		s1.start();
		s2.start();
		s3.start();
		Thread.sleep(1000); //主线程睡眠1000ms，等待它t1和t2线程运行结束
		System.out.println(sb);
	}

}

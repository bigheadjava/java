package ch050;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 演示中断线程阻塞
 * 
 * @author 程序猿大头
 *
 */
public class Sample6 extends Thread {
	private int a;

	private Timer timer = new Timer(true); // 创建一个计时器，可以指定其相关的线程作为守护程序(后台线程)运行

	public synchronized void reset() {
		a = 0;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (a > 3) {
					 Thread thread = currentThread();
					timer.schedule(new TimerTask() {
						@Override
						public void run() {
							System.out.println(thread.getName() + "等待了3秒...");
							thread.interrupt(); // 中断阻塞
						}
					}, 3000);

					try {
						this.wait(); // 让线程进入阻塞
					} catch (InterruptedException e) {
						System.out.println(thread.getName() + "中断了阻塞...");
						e.printStackTrace();
						return;
					}
				}
				a++;
				System.out.println(currentThread().getName() + " : a = " + a);
			}
		}
	}

	public static void main(String[] args) {
		Sample6 s = new Sample6();
		s.start();
	}

}

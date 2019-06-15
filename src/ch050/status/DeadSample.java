package ch050.status;

import java.io.IOException;

/**
 * 演示线程因为发生异常而进入死亡状态
 * 
 * @author 程序猿大头
 *
 */
public class DeadSample extends Thread {

	@Override
	public void run() {
		int a = 1;
		while (a <= 20) {
			System.out.println(currentThread().getName() + " : a = " + a);
			if (a == 8 && currentThread().getName().equals("ds1")) {
				throw new RuntimeException("执行线程ds1发生异常...");
			}
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			a++;
		}
	}

	public static void main(String[] args) throws IOException {
		DeadSample ds = new DeadSample();
		ds.setName("ds1");
		ds.start();
		ds.run();
		System.out.println("线程ds1是否还活着: " + ds.isAlive());
		System.out.println("主线程执行完毕...");
	}

}

package ch050.sync.product.ticket.v5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 模拟三个窗口卖票，Lock方式
 * 
 * @author 程序猿大头
 *
 */
public class Ticket extends Thread {

	private static int count = 50;

	Lock lock = new ReentrantLock(); // 为当前对象创建一个锁

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			lock.lock(); // 获取锁
			try {
				if (count > 0) {
					try {
						sleep(200); // 模拟卖一张票需要200ms
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(currentThread().getName() + ": 卖出一张票，余票" + (--count) + "张...");

				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				lock.unlock(); // 释放锁
			}

			try {
				sleep(200); // 卖完一张票让当前窗口线程休息下，给别的窗口线程卖票机会
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

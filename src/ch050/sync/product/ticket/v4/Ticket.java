package ch050.sync.product.ticket.v4;

/**
 * 模拟三个窗口卖票，同步代方法方式
 * 
 * @author 程序猿大头
 *
 */
public class Ticket implements Runnable {

	private static int count = 50; 

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			sellTicket();

			try {
				Thread.sleep(200); // 卖完一张票让当前窗口线程休息下，给别的窗口线程卖票机会
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private synchronized void sellTicket() {
		if (count > 0) {
			try {
				Thread.sleep(200); // 模拟卖一张票需要200ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": 卖出一张票，余票" + (--count) + "张...");
		}
	}
}

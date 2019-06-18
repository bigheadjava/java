package ch050.sync.product.ticket.v4;

/**
 * 模拟三个窗口卖票，同步方法方式
 * @author 程序猿大头
 *
 */
public class Demo {

	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		for(int i  = 1; i <= 3; i++) {
			Thread t = new Thread(ticket);
			t.setName("售票窗口"+i);
			t.start();
		}
	}

}

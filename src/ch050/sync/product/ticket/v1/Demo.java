package ch050.sync.product.ticket.v1;

/**
 * 模拟三个窗口卖票，错误的代码示范
 * @author 程序猿大头
 *
 */
public class Demo {

	public static void main(String[] args) {
		Ticket t1 = new Ticket("售票窗口1");
		Ticket t2 = new Ticket("售票窗口2");
		Ticket t3 = new Ticket("售票窗口3");
		t1.start();
		t2.start();
		t3.start();
	}

}

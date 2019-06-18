package ch050.sync.product.v2;

/**
 * 演示同步锁
 * 
 * @author 程序猿大头
 * 
 *         堆栈
 */
public class Stack {
	private String name;
	private String[] buffer = new String[10]; // 缓冲数组
	private int point = -1; // 模拟一个指针

	public Stack() {

	}

	public Stack(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public synchronized int getPoint() {
		return point;
	}

	/**
	 * 从堆栈中弹出产品
	 * 
	 * @return
	 */
	public synchronized String pop() {
		String goods = buffer[point];
		buffer[point] = null;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		point--;
		return goods;
	}

	/**
	 * 向堆栈中压入产品
	 * 
	 * @param goods
	 */
	public synchronized void push(String goods) {
		point++;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		buffer[point] = goods;
	}
}

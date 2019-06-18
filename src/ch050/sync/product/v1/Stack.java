package ch050.sync.product.v1;

/**
 * 模拟生产者消费者, 破坏原子操作
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

	public int getPoint() {
		return point;
	}

	/**
	 * 从堆栈中弹出产品
	 * 
	 * @return
	 */
	public String pop() {
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
	public void push(String goods) {
		point++;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		buffer[point] = goods;
	}
}

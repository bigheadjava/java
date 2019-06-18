package ch050.sync.product.v1;

/**
 * 模拟生产者消费者
 * 
 * @author 程序猿大头
 * 
 *         生产者线程
 */
public class Producer extends Thread {
	private Stack stack;

	public Producer(Stack stack, String name) {
		super(name);
		this.stack = stack;
		start(); // 启动自身生产者线程
	}

	/**
	 * 往堆栈中放入产品
	 */
	@Override
	public void run() {
		String goods;
		for (int i = 0; i < 100; i++) {
			goods = "Goods" + (stack.getPoint() + 1);
			stack.push(goods); // 往堆栈中放入产品
			System.out.println(getName() + " : push " + goods + " to " + stack.getName() + "...");
			yield();
		}
		super.run();
	}
}

package ch050.sync.product.v1;

/**
 * 模拟生产者消费者
 * 
 * @author 程序猿大头
 * 
 *         消费者线程
 */
public class Consumer extends Thread {
	private Stack stack;

	public Consumer(Stack stack, String name) {
		super(name);
		this.stack = stack;
		start(); // 启动自身消费者线程
	}

	@Override
	public void run() {
		String goods;
		for (int i = 0; i < 100; i++) {
			goods = stack.pop();
			System.out.println(getName() + " : pop " + goods + " from " + stack.getName() + "...");
			yield();
		}
	}
}

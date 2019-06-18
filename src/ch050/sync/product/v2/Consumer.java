package ch050.sync.product.v2;

/**
 * 演示同步锁
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
		for (int i = 0; i < 200; i++) {
			goods = stack.pop();
			System.out.println(getName() + " : pop " + goods + " from " + stack.getName() + "...");
			yield();
		}
	}
}

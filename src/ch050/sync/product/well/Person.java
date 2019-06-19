package ch050.sync.product.well;

/**
 * 模拟10个人打水，演示并发和同步
 * 
 * @author 程序猿大头
 *
 */
public class Person extends Thread {
	private Well well;

	public Person(String name, Well well) {
		super(name);
		this.well = well;
		start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			well.fetchWater();
			try {
				sleep(100); // 让其他人来打水
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

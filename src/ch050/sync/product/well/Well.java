package ch050.sync.product.well;

/**
 * 模拟10个人打水，演示并发和同步
 * @author 程序猿大头
 *
 */
public class Well {

	private int water = 200;

	/**
	 * 从井中取水
	 */
	public synchronized void fetchWater() {
		water--;
		System.out.println(Thread.currentThread().getName() + "打水一桶，水井剩余水" + water + "桶...");
	}
}

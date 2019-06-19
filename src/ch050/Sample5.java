package ch050;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示线程之间的通信
 * 
 * @author 程序猿大头
 *
 */
public class Sample5 {
	static List<Integer> list = new ArrayList<Integer>();
	static Object obj = new Object();

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized (obj) {
					while (true) {
						try {
							obj.wait(); // 添加之前，让t2线程检查是否满50个元素了
							obj.notify();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						list.add(1);
						System.out.println(currentThread().getName() + " : 向list中添加了一个元素...");
					}
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized (obj) {
					while (true) {
						if (list.size() == 50) {
							System.out.println(currentThread().getName() + " : list中已经有50个元素了，请歇歇吧...");
							System.exit(0);
						} else {
							System.out.println(currentThread().getName() + " : list中才" + list.size() + " 个元素，请加油吧...");
							obj.notify(); // 没到50通知t1继续添加
							try {
								obj.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		};

		t1.start();
		t2.start();
	}

}

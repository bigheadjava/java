package ch050.control;

/**
 * 演示控制线程
 * 
 * @author 程序猿大头
 *
 */
public class Demo extends ControlThread {
	private int count;

	@Override
	public void run() {
		while (count < 1000) {
			synchronized (this) {
				count++;
				System.out.println(currentThread().getName() + " : " + "run " + count + " times...");
			}

			if (!checkStatus()) {
				System.out.println(currentThread().getName() + " : " + "stop...");
				break;
			}
			try {
				sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized int getCount() {
		return count;
	}

	public synchronized void reset() {
		count = 0;
		System.out.println(currentThread().getName() + " : " + "reset...");
	}

	public static void main(String[] args) throws InterruptedException {
		Demo d = new Demo();
		d.start();

		for (int i = 0; i < 100; i++) {
			if (d.getCount() > 5) {
				d.setStatus(ControlThread.SUSP); // 让线程暂停
				sleep(100);
				d.reset();
				d.setStatus(ControlThread.RUN); // 让线程恢复运行
			}
			sleep(20);
		}

		d.setStatus(ControlThread.STOP); // 让线程终止
	}

}

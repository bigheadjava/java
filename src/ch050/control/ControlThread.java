package ch050.control;

/**
 * 演示控制线程
 * 
 * @author 程序猿大头
 *
 */
public class ControlThread extends Thread {
	public static final int SUSP = 1; // 暂停状态
	public static final int STOP = 2; // 停止状态
	public static final int RUN = 0; // 运行状态

	private int status = RUN;

	public synchronized void setStatus(int status) {
		this.status = status;
		if (status == RUN) {
			notify(); //让线程恢复运行
		}
	}

	public synchronized boolean checkStatus() {
		while (status == SUSP) {
			try {
				System.out.println(currentThread().getName() + " : " + "wait...");
				wait(); //让线程释放锁，进入对象等待池
			} catch (InterruptedException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		if (status == STOP) {
			return false;
		}
		return true;
	}
}

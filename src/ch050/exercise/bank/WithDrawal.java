package ch050.exercise.bank;

/**
 * 多线程作业
 * 
 * @author 程序猿大头
 *
 */
public class WithDrawal extends Thread {

	private Account account;

	public WithDrawal() {

	}

	public WithDrawal(Account account, String threadName) {
		super(threadName);
		this.account = account;
		start();
	}

	@Override
	public void run() {
		synchronized (account) {
			System.out.println(getName() + "开始取钱...");
			double amount = account.getAmount(); // 第一步获取账户余额
			try {
				sleep(200); // 模拟每一步操作需要200ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			amount -= 2000; // 第二步减去取钱的数目
			try {
				sleep(200); // 模拟每一步操作需要200ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			account.setAmount(amount); // 第三步更新余额
			try {
				sleep(200); // 模拟每一步操作需要200ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(account.toString());
		}
	}

	public static void main(String[] args) {
		Account account = new Account("BANK0001", "张三", 10000.0);
		WithDrawal wife = new WithDrawal(account, "老婆");
		WithDrawal husband = new WithDrawal(account, "老公");
	}

}

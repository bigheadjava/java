package ch050.sync.bank.v1;

/**
 * 
 * 模拟打破原子操作
 * 
 * @author 程序猿大头
 *
 *         测试类
 */
public class Demo {

	public class BankSystem extends Thread {
		private Account acc;

		public BankSystem() {

		}

		public BankSystem(Account acc) {
			this.acc = acc;
		}

		@Override
		public void run() {
			double amount = acc.getAmount();
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			acc.setAmount(amount - 1000);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account("BANK001", "Ma Jun", 10000);
		Demo.BankSystem wife = new Demo().new BankSystem(acc);
		Demo.BankSystem husband = new Demo().new BankSystem(acc);
		wife.setName("老婆取钱");
		husband.setName("老公取钱");
		wife.start();
		husband.start();
		Thread.sleep(1000);
		System.out.println(acc.toString());
	}

}

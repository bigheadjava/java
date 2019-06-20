package ch050.exercise.bank;

/**
 * 多线程作业
 * 
 * @author 程序猿大头
 *
 */
public class Account {
	private String accountId; // 账户id
	private String name; // 账户名字
	private double amount; // 账户余额

	public Account() {
		super();
	}

	public Account(String accountId, String name, double amount) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.amount = amount;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "尊敬的" + name + "先生/女士," + " 您的账户" + accountId + "发生动帐交易，账户最新余额为" + amount + "元...";
	}

}

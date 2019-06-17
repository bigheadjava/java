package ch050.sync.bank.v1;

/**
 * 模拟打破原子操作
 * 
 * @author 程序猿大头
 * 
 *         银行账户类
 */
public class Account {
	private String id; // 账号ID
	private String name; // 账号名字
	private double amount; // 账户余额

	public Account() {
		super();
	}

	public Account(String id, String name, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return name + "您好! 您的账号" + id + "当前余额为" + amount + "元";
	}
}

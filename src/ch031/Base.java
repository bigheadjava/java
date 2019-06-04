package ch031;

/**
 * 演示super用法
 * @author 程序猿大头
 *
 */
public class Base {
	public String var = "Base var";
	protected int count;

	public Base() {
		count++;
	}

	public Base(int count) {
		this.count = count;
	}

	public void method() {
		System.out.println("Used method in Base class...");
	}
}

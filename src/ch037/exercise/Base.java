package ch037.exercise;


/**
 * 课堂练习
 * 
 * @author 程序猿大头
 *
 */
public class Base {
	static int var;
	String str;

	static {
		var++;
	}

	public Base() {
		var *= 2;
	}

	public Base(String str) {
		this.str = str;
	}

	void method() {
		var++;
	}
}

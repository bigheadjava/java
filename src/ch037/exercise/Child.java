package ch037.exercise;

/**
 * 课堂练习
 * 
 * @author 程序猿大头
 *
 */
public class Child extends Base {
	
	static {
		var++;
	}

	public Child() {
		var++;
	}

	public Child(String str) {
		var++;
	}

	void method() {
		var++;
		System.out.println("Child method: " + var);
	}

	public static void main(String[] args) {
		Child c = new Child("hello");
		System.out.println(c.var);
	}

}

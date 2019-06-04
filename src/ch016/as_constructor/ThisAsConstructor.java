package ch016.as_constructor;

/**
 * 演示this作为方法名
 * @author 程序猿大头
 *
 */
public class ThisAsConstructor {
	int var;

	ThisAsConstructor(double var) {
		this.var = (int) var;
	}

	ThisAsConstructor(int var) {
		this("Baby");
	}

	ThisAsConstructor(String var) {
		this();
		System.out.println(var);
	}

	ThisAsConstructor() {
		System.out.println("How are you?");
	}

	public static void main(String[] args) {

		ThisAsConstructor tester = new ThisAsConstructor(5);
	}
}

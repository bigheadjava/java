package ch047.use.v1;

/**
 * 
 * @author 程序猿大头
 *
 */
public class ClassB {
	private ClassA a;

	public ClassB() {

	}

	public ClassB(ClassA a) {
		this.a = a;
	}

	public void reset() {
		a.setCount(0);
	}
}

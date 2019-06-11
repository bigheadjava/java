package ch047.fourth;

/**
 * 演示内部类中的this
 * 
 * @author 程序猿大头
 *
 */
public class ClassA {
	String word = "外部类ClassA的word...";

	class ClassB { // ClassA的内部类
		String word = "内部类ClassB的word...";

		public void method() {
			System.out.println("word = " + word);
			System.out.println("this.word = " + this.word);
			System.out.println("ClassA.this.word = " + ClassA.this.word);
		}
	}

	public static void main(String[] args) {
		new ClassA().new ClassB().method();
	}

}

package ch047.first;

/**
 * 演示内部类
 * @author 程序猿大头
 *
 */
public class Demo {

	public static void main(String[] args) {
		OuterClass  oc = new OuterClass();
		oc.add(3, 99);
		
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
	}

}

package ch023;

/**
 * 演示数组中的元素是引用
 * @author 程序猿大头
 *
 */
public class ReferenceArray {
	private int var1;

	public ReferenceArray() {

	}

	public ReferenceArray(int var1) {
		this.var1 = var1;
	}

	public static void main(String[] args) {
		ReferenceArray ra = new ReferenceArray(1);
		/**
		 * 创建一个ReferenceArray类型的数组，并把ra作为数组第一个元素
		 */
		ReferenceArray[] ras = new ReferenceArray[] { ra, null };
		System.out.println(ras[0].getVar1());
		/**
		 * 改动ra中的属性var1
		 */
		ra.setVar1(9);
		System.out.println("----------改动之后----------");
		System.out.println(ras[0].getVar1());
	}

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

}

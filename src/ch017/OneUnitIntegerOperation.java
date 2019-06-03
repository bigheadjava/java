package ch017;

/**
 * 用于演示一元整型操作符
 * 
 * @author 程序猿大头
 *
 */
public class OneUnitIntegerOperation {

	public static void main(String[] args) {
		int a = 5, b = 5, c = 5, d = 5, e = 5, f = 5;
		System.out.println("运算之前，a = " + a + "; b = " + b + "; c = " + c + "; d = " + d + "; e = " + e + "; f = " + f);
		a++;// 加1
		b--;// 减1
		e = ~c; // 把变量c逐位取反的结果赋值给变量e
		f = -d; // 把变量d取反的结果赋值给变量f
		System.out.println("运算之后，a = " + a + "; b = " + b + "; c = " + c + "; d = " + d + "; e = " + e + "; f = " + f);
	}

}

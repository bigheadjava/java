package ch017;

/**
 * 用于演示++操作符
 * 
 * @author 程序猿大头
 *
 */
public class AutoAddOperation {

	public static void main(String[] args) {
		int i = 0, j = 10, g = 0, k = 100;
		i = j++; // 后置操作符，先把j赋值给i，然后把j+1
		g = ++k; // 前置操作符，先把k+1，然后再把k+1的结果赋值给j
		System.out.println("j = " + j + "; k = " + k);
		System.out.println("i = " + i + "; g = " + g);
	}

}

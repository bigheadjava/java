package ch020;

/**
 * 演示do...while循环用法 
 * 求1+2+3...+100的结果
 * 
 * @author 程序猿大头
 *
 */
public class DoWhileLoopDemo {

	public static void main(String[] args) {
		int i = 0, result = 0;
		do {
			result += i;
			i++;
		} while (i <= 100);
		System.out.println(result);
	}

}

package ch020;

/**
 * 演示多重循环用法
 * 用*在控制台拼凑个直角三角形。
 * 
 * @author 程序猿大头
 *
 */
public class MultipleLoopDemo {

	public static void main(String[] args) {
		for(int i = 0; i < 12; i ++) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println(); //换行
		}
	}

}

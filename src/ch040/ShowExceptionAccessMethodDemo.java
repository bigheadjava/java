package ch040;

/**
 * 演示访问异常信息的方法
 * @author 程序猿大头
 *
 */
public class ShowExceptionAccessMethodDemo {

	public static void main(String[] args) {
		try {
			System.out.println(2/0);
		} catch (Exception e) {
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.toString(): " + e.toString());
			e.printStackTrace();
		}
	}

}

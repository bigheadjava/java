package ch009;

/**
 * 演示几种整数类型操作 
 * 
 * @author 程序猿大头
 *
 */
public class IntegerTransferSample {

	public static void main(String[] args) {
		/**
		 * 定义一个byte类型变量month
		 */
		byte month = 1;

		/**
		 * 对month+238并赋值给新的byte类型变量a 必须强制转换，因为如果数学表达式中都是整数，那么表达式的返回值只可能是int类型或long类型
		 */
		byte a = (byte) (month + 238);

		/**
		 * 定义int类型变量b，并把变量month+1赋值给b 因为b是int类型，不需要强制转换
		 */
		int b = month + 1;

		/**
		 * 定义long类型变量c，并把变量month+1赋值给b 因为c是long类型，不需要强制转换
		 */
		long c = month + 1;
	}

}

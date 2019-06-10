package ch046;

/**
 * 演示枚举的用法
 * 
 * @author 程序猿大头
 *
 */
public class UseEnum {

	public static void main(String[] args) {
		printEnum();
		matchEnum();
		WeekDay wd = WeekDay.SAT;
		System.out.println(wd.getDeclaringClass());
		System.out.println(wd.name());
		System.out.println(wd.toString());
		System.out.println(wd.ordinal());
		System.out.println(WeekDayV2.FRI.getValue());
	}

	/**
	 * 打印枚举中每个元素
	 */
	public static void printEnum() {
		for (WeekDay d : WeekDay.values()) {
			System.out.println(d);
		}
	}

	public static void matchEnum() {
		WeekDay wd = WeekDay.WED;
		switch (wd) {
		case MON:
			System.out.println("今天星期一...");
			break;
		case TUE:
			System.out.println("今天星期二...");
			break;
		case WED:
			System.out.println("今天星期三...");
			break;
		case THU:
			System.out.println("今天星期四...");
			break;
		case FRI:
			System.out.println("今天星期五...");
			break;
		case SAT:
			System.out.println("今天星期六...");
			break;
		case SUN:
			System.out.println("今天星期日...");
			break;
		default:
			System.out.println("输入有误...");
			break;
		}
	}
}

package ch004;

import java.util.Calendar;
import java.util.Date;

/**
 * 演示导入包
 * 
 * @author 程序猿大头
 *
 */
public class SampleClassNameDemo2 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // 获得日历对象
		Date currentDate = c.getTime(); // 获取当前时间
		System.out.println(currentDate);
	}

}

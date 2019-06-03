package ch004;

import java.util.Calendar;

/**
 * 演示一个类同时引用了两个来自于不同包的同名类
 * 
 * @author 程序猿大头
 *
 */
public class ImportPackageDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // 获得日历对象
		java.util.Date currentDate = c.getTime(); // 获取当前时间
		java.sql.Date sqlDate = new java.sql.Date(c.getTimeInMillis());
		System.out.println(currentDate);
		System.out.println(sqlDate);
	}

}

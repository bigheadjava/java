package core_java.util;

import java.util.Date;

/**
 * 简单log
 * 
 * @author 程序猿大头
 *
 */
public class MyLog {
	private static MyLog log;
	private Class clazz;

	private MyLog(Class c) {
		super();
		clazz = c;
	}

	public static MyLog getInstance(Class c) {
		if (log == null) {
			log = new MyLog(c);
		}
		return log;
	}

	public void logInfo(String s) {
		try {
			StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
			Date now = DateUtil.getCurrrentDate();
			String nowStr = DateUtil.dateFormat(now, DateUtil.DATE_TIME_PATTERN);
			nowStr = "[" + nowStr + "]: ";
			s = "[INFO][" + clazz.getSimpleName() + "][" + stacks[2].getMethodName() + "][Line Number: "
					+ stacks[2].getLineNumber() + "]" + nowStr + s + "\r\n";
			System.out.print(s);
			FileUtil.writeFile("/Users/resource/codes/java/src/ch051/files/out/log.txt", "UTF-8", s, true);
		} catch (Exception e) {
			throw new RuntimeException("Error happend for log...");
		}
	}

	public void logError(String s) {
		try {
			StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
			Date now = DateUtil.getCurrrentDate();
			String nowStr = DateUtil.dateFormat(now, DateUtil.DATE_TIME_PATTERN);
			nowStr = "[" + nowStr + "]: ";
			s = "[ERROR][" + clazz.getSimpleName() + "][" + stacks[2].getMethodName() + "][Line Number: "
					+ stacks[2].getLineNumber() + "]" + nowStr + s + "\r\n";
			System.err.print(s);
			FileUtil.writeFile("/Users/resource/codes/java/src/ch051/files/out/log.txt", "UTF-8", s, true);
		} catch (Exception e) {
			throw new RuntimeException("Error happend for log...");
		}
	}

}

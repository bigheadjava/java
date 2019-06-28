package ch044;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式 - 捕获组
 * 
 * @author 程序猿大头
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		// 按指定模式在字符串查找
		String line = "My name is Bob and I'm 18 years old!";
		/**
		 * \\: 前面一个\是转义
		 * \D: 非数字字符匹配。等效于 [^0-9]
		 * d: 数字字符匹配。等效于 [0-9]; 
		 * .: 匹配除"\r\n"之外的任何单个字符。若要匹配包括"\r\n"在内的任意字符，请使用诸如"[\s\S]"之类的模式。
		 * *: 零次或多次匹配前面的字符或子表达式。
		 */
		String pattern = "(\\D*)(\\d+)(.*)";  

		// 创建 Pattern 对象
		Pattern r = Pattern.compile(pattern);
		System.out.println(r.pattern());

		// 现在创建 matcher 对象
		Matcher m = r.matcher(line);
		if (m.find()) {
			System.out.println("Found value: " + m.group(0)); 
			System.out.println("Found value: " + m.group(1)); 
			System.out.println("Found value: " + m.group(2)); 
			System.out.println("Found value: " + m.group(3)); 
		} else {
			System.out.println("NO MATCH");
		}

	}

}

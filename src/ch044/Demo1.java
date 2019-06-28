package ch044;

import java.util.regex.Pattern;

/**
 * 用正则表达式查找字符串
 * 
 * @author 程序猿大头
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		String content = "Hello, I am a Java software PM";
		String pattern = ".*Java.*"; //大小写敏感
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("字符串中是否包含了 'Java' 子字符串? " + isMatch);
	}

}

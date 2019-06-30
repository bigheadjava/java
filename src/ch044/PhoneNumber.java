package ch044;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 利用正则找出一堆手机号中的豹子号，三个或三个以上相连的数字相同
 * 
 * @author 程序猿大头
 *
 */
public class PhoneNumber {

	public static void main(String[] args) {
		String reg = "(\\d)\\1{2,}"; // \1是反向引用，代表group1，也就是(\d), {n,}表示至少出现n次
		Pattern p = Pattern.compile(reg);
		for (String s : generatePhoneNum(200)) {
			Matcher ma = p.matcher(s);
			if (ma.find()) {
				System.out.println("找到豹子号: " + s);
			}
		}
	}

	private static String[] generatePhoneNum(int count) {
		String[] strs = new String[count];
		for (int i = 0; i < strs.length; i++) {
			String str = "189";
			int j = 0;
			while (j < 8) {
				int num = (int) (Math.random() * 10);
				str += num;
				j++;
			}
			strs[i] = str;
		}
		return strs;
	}

}

package ch019;

/**
 * 演示switch语句的用法
 * @author 程序猿大头
 * 
 * 根据考试等级打印分数范围：
 * A: 90 - 100 (包含90和100)
 * B: 80 - 89  (包含80和89)
 * C: 60 - 79  (包含60和79)
 * D: 0 - 59 (包含0和59)
 * 其他情况： 输出输入等级非法
 *
 */
public class SwithDemo {

	public static void main(String[] args) {
		char grade = 'B';
		String rang = "";
		switch(grade) {
		case 'A':
			rang = "score rang is 90 ~ 100.";
			break;
		case 'B':
			rang = "score rang is 80 ~ 89.";
			break;
		case 'C':
			rang = "score rang is 60 ~ 79.";
			break;
		case 'D':
			rang = "score rang is 0 ~ 59.";
			break;
		default:
			rang = "The grade you filled is invalid.";
			break;
		}
		System.out.println(rang);
	}

}

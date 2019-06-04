package ch019;

/**
 * 演示if...else用法 
 * 
 * 学生考试成绩，如果大于等于90，就属于优秀； 
 * 大于等于80小于90就属于良好； 
 * 大于等于60小于80属于一般；
 * 小于60，属于不及格
 * 
 * @author 程序猿大头
 *
 */
public class IfElseDemo {

	public static void main(String[] args) {
		float score = 61.5f;
		String grade = "";
		if(score >= 90) {
			grade = "优秀";
		}else if(score >= 80) {
			grade = "良好";
		}else if(score >= 60) {
			grade = "一般";
		}else {
			grade = "不及格";
		}
		System.out.println(grade);
	}

}

package ch020;

/**
 * 演示while循环用法
 * 打印出0-100之间的整数
 * 
 * @author yinchu
 *
 */
public class WhileLoopDemo {

	public static void main(String[] args) {
		byte i = 0; //初始化部分
		while(i <= 100) { //循环条件
			/**
			 * 下面是循环体
			 */
			System.out.println(i); 
			i++; //迭代条件
		}
	}

}

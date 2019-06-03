package ch014;

/**
 * 用于演示静态变量和实例变量的区别
 * 
 * @author 程序猿大头
 *
 */
public class StaticVar {
	/**
	 * 声明实例变量var并赋值1
	 */
	public int var = 1;

	/**
	 * 声明静态变量static_var并赋值1
	 */
	public static int static_var = 1;

	public static void main(String[] args) {
		/**
		 * 创建2个StaticVar对象s1和s2
		 */
		StaticVar s1 = new StaticVar();
		StaticVar s2 = new StaticVar();

		System.out.println("改变s1.var之前，s1.var = " + s1.var);
		System.out.println("改变s1.var之前，s2.var = " + s2.var);
		/**
		 * 改变s1.var,让它加1
		 */
		s1.var = s1.var + 1;
		System.out.println("改变s1.var之后，s1.var = " + s1.var);
		System.out.println("改变s1.var之后，s2.var = " + s2.var);

		System.out.println("-----------------Split Line---------------------");
		/**
		 * 改变s1.static_var,让它加99
		 */
		System.out.println("改变s1.static_var之前，s1.static_var = " + s1.static_var);
		System.out.println("改变s1.static_var之前，s2.static_var = " + s2.static_var);
		s1.static_var = s1.static_var + 99;
		System.out.println("改变s1.static_var之后，s1.static_var = " + s1.static_var);
		System.out.println("改变s1.static_var之后，s2.static_var = " + s2.static_var);
	}

}

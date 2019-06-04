package ch029.pkg2;

/**
 * 演示Java的控制访问级别
 * @author 程序猿大头 
 *
 */
public class ClassA {
	public int public_var;
	protected int protected_var;
	int default_var;
	private int private_var;

	public void method() {
		public_var = 1;
		protected_var = 1;
		default_var = 1;
		private_var = 1;
	}
}

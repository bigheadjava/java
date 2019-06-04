package ch027.pkg1;

/**
 * 演示继承
 * @author 程序猿大头
 *
 */
public class Base {
	private int private_var; // 私有访问级别
	public String public_var; // 公开访问级别
	protected int protected_var; // 受保护访问级别
	char default_var; // 默认访问级别

	// 公开访问级别
	public void public_method() {
		System.out.println("...public_method...");
	}

	// 受保护访问级别
	protected void protected_method() {
		System.out.println("...protected_method...");
	}

	// 默认访问级别
	void default_method() {
		System.out.println("...default_method...");
	}

	// 私有访问级别
	private void private_method() {
		System.out.println("...private_method...");
	}
}

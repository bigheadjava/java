package ch015;

import ch014.StaticVar;

/**
 * 用于演示成员变量的默认值 
 * 
 * @author 程序猿大头
 *
 */
public class InstanceVarDefaultValueDemo {

	private int int_var;
	private boolean boolean_var;
	private float float_var;
	private double double_var;
	private char char_var;

	private StaticVar static_var;
	private String string_var;

	public static void main(String[] args) {
		InstanceVarDefaultValueDemo var = new InstanceVarDefaultValueDemo();

		System.out.println(" int_var = " + var.int_var);
		System.out.println(" boolean_var = " + var.boolean_var);
		System.out.println(" float_var = " + var.float_var);
		System.out.println(" double_var = " + var.double_var);
		System.out.println(" char_var = " + var.char_var);
		System.out.println(" static_var = " + var.static_var);
		System.out.println(" string_var = " + var.string_var);
	}

}

package ch045.un_change;

/**
 * 演示不可变类
 * 
 * @author 程序猿大头
 *
 */
public class NoChangClass {
	private final int var_1;
	private final String var_2;

	public NoChangClass(int var_1, String var_2) {
		super();
		this.var_1 = var_1;
		this.var_2 = var_2;
	}

	public int getVar_1() {
		return var_1;
	}

	public String getVar_2() {
		return var_2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + var_1;
		result = prime * result + ((var_2 == null) ? 0 : var_2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoChangClass other = (NoChangClass) obj;
		if (var_1 != other.var_1)
			return false;
		if (var_2 == null) {
			if (other.var_2 != null)
				return false;
		} else if (!var_2.equals(other.var_2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "var_1 = " + var_1 + "; var_2 = " + var_2;
	}

}

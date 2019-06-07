package ch040.register;

/**
 * 演示异常的多样化处理
 * @author 程序猿大头
 * 测试类
 */
public class Demo {

	public static void main(String[] args) throws RegisterException {

		String name = null;
		int age = -1;
		String sex = "人妖";

		RegisterException re = new RegisterException();

		try {
			if (name == null) {
				throw new CheckFieldException("用户名不能为空!");
			}
		} catch (CheckFieldException e) {
			re.addException(e);
		}

		try {
			if (age <= 0) {
				throw new CheckFieldException("年龄必须大于0!");
			}
		} catch (CheckFieldException e) {
			re.addException(e);
		}

		try {
			if (sex == null || sex.length() > 1) {
				throw new CheckFieldException("性别必须是一个字符!");
			}
		} catch (CheckFieldException e) {
			re.addException(e);
		}

		if (re.getExceptionList().size() > 0) {
			System.err.println(re.getMessage());
			throw re;
		}
	}

}

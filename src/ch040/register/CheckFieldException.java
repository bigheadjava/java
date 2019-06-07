package ch040.register;

/**
 * 演示异常的多样化处理
 * @author 程序猿大头
 * 自定义异常类
 */
public class CheckFieldException extends Exception {

	public CheckFieldException() {
	}

	public CheckFieldException(String message) {
		super(message);
	}

	public CheckFieldException(Throwable cause) {
		super(cause);
	}

	public CheckFieldException(String message, Throwable cause) {
		super(message, cause);
	}

	public CheckFieldException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

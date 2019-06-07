package ch040.register;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


/**
 * 演示异常的多样化处理
 * @author 程序猿大头
 * 自定义异常类
 */
public class RegisterException extends Exception {

	protected Throwable cause;

	private List<Throwable> exceptionList = new ArrayList<Throwable>();

	public RegisterException() {

	}

	public RegisterException(String message) {
		super(message);
	}

	public RegisterException(Throwable cause) {
		this.cause = cause;
	}

	public RegisterException(Throwable cause, String message) {
		super(message);
		this.cause = cause;
	}

	public Throwable getCause() {
		return this.cause;
	}

	public List<Throwable> getExceptionList() {
		return this.exceptionList;
	}

	public void addException(Throwable e) {
		this.exceptionList.add(e);
	}

	public Throwable initCause(Throwable cause) {
		this.cause = cause;
		return this;
	}

	@Override
	public void printStackTrace() {
		printStackTrace(System.err);
	}

	@Override
	public void printStackTrace(PrintStream outStream) {
		printStackTrace(new PrintWriter(outStream));
	}

	@Override
	public void printStackTrace(PrintWriter writer) {
		super.printStackTrace(writer);

		if (getCause() != null) {
			getCause().printStackTrace(writer);
		}
		writer.flush();
	}

	@Override
	public String getMessage() {
		super.getMessage();
		StringBuilder sb = new StringBuilder();
		for (Throwable t : exceptionList) {
			sb.append(t.getMessage()).append("\r\n");
		}
		return sb.toString();
	}
}

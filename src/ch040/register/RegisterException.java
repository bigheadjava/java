package ch040.register;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 演示异常的多样化处理
 * 
 * @author 程序猿大头 自定义异常类
 */
public class RegisterException extends Exception {

	/**
	 * 表示当前异常由哪个Throwable引起 如果为null表示此异常不是由其他Throwable引起的
	 * 如果此对象与自己相同,表明此异常的起因对象还没有被初始化
	 */
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
	
	/**  
     * 初始化起因对象,这个方法只能在未被初始化的情况下调用一次  
     */    
	public Throwable initCause(Throwable cause) {
		this.cause = cause;
		return this;
	}
	
	/**  
     * 打印出错误轨迹  
     */   
	@Override
	public void printStackTrace() {
		printStackTrace(System.err);
	}

	/**  
     * 打印出错误轨迹  
     */   
	@Override
	public void printStackTrace(PrintStream outStream) {
		printStackTrace(new PrintWriter(outStream));
	}
	
	/**  
     * 打印出错误轨迹  
     */ 
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

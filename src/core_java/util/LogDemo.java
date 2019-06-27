package core_java.util;

public class LogDemo {
	protected MyLog log = MyLog.getInstance(this.getClass());
	
	public static void main(String[] args) {
		LogDemo demo = new LogDemo();
		for(int i=0; i< 500; i++) {
			demo.log.logInfo("中华人民共和国万岁！");
		}
		
		for(int i=0; i< 500; i++) {
			demo.log.logError("中华人民共和国万岁！");
		}

	}

}

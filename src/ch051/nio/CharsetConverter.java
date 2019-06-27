package ch051.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import core_java.util.MyLog;

/**
 * 演示字符编码转换
 * 
 * @author 程序猿大头
 *
 */
public class CharsetConverter {
	private static MyLog log = MyLog.getInstance(CharsetConverter.class);

	public static void main(String[] args) throws IOException{
		//代码1
		ByteBuffer bb = ByteBuffer.wrap("中华".getBytes("UTF-8"));
		CharBuffer cb = bb.asCharBuffer();
		log.logInfo(cb.toString()); //输出乱码
		
		//代码2
		bb = ByteBuffer.wrap("中华".getBytes("UTF-16BE")); //UTF-16BE是Unicode的一种
		cb = bb.asCharBuffer();
		log.logInfo(cb.toString()); //正确输出
		
		//代码3
		bb = ByteBuffer.wrap("中华".getBytes("UTF-8"));
		Charset cs = Charset.forName("UTF-8");
		cb = cs.decode(bb);
		log.logInfo(cb.toString()); //正确输出
		
		//代码4
		cs = Charset.forName("GBK");
		bb = cs.encode("中华");
		cb = cs.decode(bb);
		for(int i = 0; i < cb.limit(); i++) {
			log.logInfo(cb.get()+"");
		}
		
	}

}

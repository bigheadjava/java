package core_java.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 文件操作工具类
 * 
 * @author 程序猿大头
 *
 */
public class FileUtil {

	/**
	 * 从一个文件中逐行读取字符串，采用本地操作系统编码
	 * 
	 * @param fileName
	 * @throws IOException
	 */
	public static void readFile(String fileName) throws IOException {
		readFile(fileName, null);
	}

	/**
	 * 从一个文件中逐行读取字符串，采用指定的字符编码
	 * 
	 * @param fileName
	 * @param charSet
	 * @throws IOException
	 */
	public static void readFile(String fileName, String charSet) throws IOException {
		InputStream in = new FileInputStream(fileName);
		InputStreamReader reader;
		if (charSet == null) {
			reader = new InputStreamReader(in);
		} else {
			reader = new InputStreamReader(in, charSet);
		}

		BufferedReader br = new BufferedReader(reader);
		String data;
		while ((data = br.readLine()) != null) {
			System.out.println(data);
		}
		closeStream(br);
	}

	/**
	 * 写文件
	 * 
	 * @param fileName: 文件路径
	 * @param charSet: 字符编码
	 * @param data: 文件内容
	 * @param append: 如果为 true，则将字节写入文件末尾处，而不是写入文件开始处
	 * @throws IOException
	 */
	public static void writeFile(String fileName, String charSet, String data, boolean append) throws IOException {
		OutputStream os = new FileOutputStream(fileName, append);
		OutputStreamWriter writer;
		if (charSet == null) {
			writer = new OutputStreamWriter(os);
		} else {
			writer = new OutputStreamWriter(os, charSet);
		}
		BufferedWriter bw = new BufferedWriter(writer);
		PrintWriter pw = new PrintWriter(bw);
		pw.write(data);
		pw.flush();
		closeStream(pw);
	}

	/**
	 * 复制文件，可以指定字符编码
	 * 
	 * @param src: 源文件
	 * @param srcCharSet: 源文件字符编码
	 * @param dest: 目标文件
	 * @param destCharSet: 目标文件字符编码
	 * @throws IOException
	 */
	public static void copyFile(String src, String srcCharSet, String dest, String destCharSet) throws IOException {
		InputStream in = new FileInputStream(src);
		InputStreamReader reader;
		if (srcCharSet == null) {
			reader = new InputStreamReader(in);
		} else {
			reader = new InputStreamReader(in, srcCharSet);
		}
		BufferedReader br = new BufferedReader(reader);

		OutputStream os = new FileOutputStream(dest);
		OutputStreamWriter writer;
		if (destCharSet == null) {
			writer = new OutputStreamWriter(os);
		} else {
			writer = new OutputStreamWriter(os, destCharSet);
		}
		BufferedWriter bw = new BufferedWriter(writer);
		PrintWriter pw = new PrintWriter(bw);
		String data;
		while ((data = br.readLine()) != null) {
			pw.println(data);
		}
		closeStream(br);
		closeStream(pw);
	}

	/**
	 * 关闭流
	 * 
	 * @param obj
	 * @throws IOException
	 */
	private static void closeStream(Object obj) throws IOException {
		if (obj != null && obj instanceof InputStream) {
			InputStream in = (InputStream) obj;
			in.close();
		}

		if (obj != null && obj instanceof OutputStream) {
			OutputStream os = (OutputStream) obj;
			os.close();
		}
	}

}

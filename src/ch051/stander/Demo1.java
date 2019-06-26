package ch051.stander;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 演示包装标准输入流
 * 
 * @author 程序猿大头
 *
 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		String data;
		while((data = br.readLine()) != null && data.length() != 0) {
			System.out.println("用户输入了: "+ data);
		}
	}

}

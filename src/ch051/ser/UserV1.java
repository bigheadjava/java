package ch051.ser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 演示部分属性不进行序列化
 * 
 * @author 程序猿大头
 *
 */
public class UserV1 implements Serializable {
	private String userName;
	private transient String password;

	public UserV1() {
		super();
	}

	public UserV1(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "userName: " + userName + "; password: " + password;
	}

	/**
	 * 加密数组，将buffer数组中每个字节的每一位取反
	 * 
	 * @param buffer
	 * @return
	 */
	private byte[] encrypt(byte[] buffer) {
		for (int i = 0; i < buffer.length; i++) {
			int b = 0;
			for (int j = 0; j < 8; j++) { // 8位一个字节
				int bit = (buffer[i] >> j & 1) == 0 ? 1 : 0;
				b += (1 << j) * bit;
			}
			buffer[i] = (byte) b;
		}
		return buffer;
	}

	private void writeObject(ObjectOutputStream stream) throws IOException {
		stream.defaultWriteObject();
		stream.writeObject(encrypt(password.getBytes()));
	}

	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
		stream.defaultReadObject();
		byte[] buffer = (byte[]) stream.readObject();
		password = new String(encrypt(buffer));
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		UserV1 user = new UserV1("messi", "MessiFootball_123");
		System.out.println("序列化之前: " + user);

		// 序列化
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(buffer);
		out.writeObject(user);

		// 反序列化
		ByteArrayInputStream is = new ByteArrayInputStream(buffer.toByteArray());
		ObjectInputStream in = new ObjectInputStream(is);
		user = (UserV1) in.readObject();

		System.out.println("序列化之后: " + user);
	}
}

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
public class User implements Serializable {
	private String userName;
	private  transient String password;

	public User() {
		super();
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "userName: " + userName + "; password: " + password;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User user = new User("messi", "MessiFootball_123");
		System.out.println("序列化之前: " + user);

		// 序列化
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(buffer);
		out.writeObject(user);

		// 反序列化
		ByteArrayInputStream is = new ByteArrayInputStream(buffer.toByteArray());
		ObjectInputStream in = new ObjectInputStream(is);
		user = (User) in.readObject();

		System.out.println("序列化之后: " + user);
	}

}

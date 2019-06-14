package ch049.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 演示Map用法
 * @author 程序猿大头
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "hello");
		map.put(2, "abc");
		map.put(3, "java");
		map.put(1, "abc");
		System.out.println(map.size());
		System.out.println(map.get(1));
		
		Set<Integer> keySet = map.keySet();
		for(Integer i : keySet) {
			System.out.println("Key: " + i + "; Value: "+ map.get(i));
		}
	}

}

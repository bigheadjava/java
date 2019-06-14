package ch049.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 演示TreeMap用法
 * 
 * @author 程序猿大头
 *
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(2, "abc");
		map.put(3, "java");
		map.put(1, "abc");
		
		Set<Integer> keySet = map.keySet();
		for(Integer i : keySet) {
			System.out.println("Key: " + i + "; Value: "+ map.get(i));
		}
	}

}

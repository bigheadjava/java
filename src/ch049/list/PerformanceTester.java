package ch049.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * 测试ArrayList、LinkedList、Vector和数组的性能
 * 
 * @author 程序猿大头
 *
 */
public class PerformanceTester {
	private static final int TIMES = 100000;

	// 静态内部类, 抽象的
	public static abstract class Tester {
		private String operation;

		public Tester(String operation) {
			this.operation = operation;
		}

		public abstract void test(List<String> list);

		public String getOperation() {
			return operation;
		}
	}

	// 执行迭代操作匿名内部类
	static Tester iterateTester = new Tester("iterate") {

		@Override
		public void test(List<String> list) {
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				it.next();
			}
		}

	};

	// 执行随机访问操作的匿名内部类
	static Tester getTester = new Tester("get") {

		@Override
		public void test(List<String> list) {
			for (int i = 0; i < list.size(); i++) {
				list.get(i);
			}
		}

	};

	// 执行插入操作的匿名内部类
	static Tester insertTester = new Tester("insert") {

		@Override
		public void test(List<String> list) {
			ListIterator<String> li = list.listIterator(list.size() / 2); // 从List的中间开始
			for (int i = 0; i < TIMES / 2; i++) {
				li.add("Java");
			}
		}

	};

	// 执行删除操作的匿名内部类
	static Tester deleteTester = new Tester("delete") {

		@Override
		public void test(List<String> list) {
			ListIterator<String> li = list.listIterator();
			while (li.hasNext()) {
				li.next();
				li.remove();
			}
		}

	};

	public static void testArray(List<String> list) {
		Tester[] testers = new Tester[] { iterateTester, getTester }; // 数组的操作是迭代和随机访问
		test(testers, list);
	}

	public static void testList(List<String> list) {
		Tester[] testers = new Tester[] { iterateTester, getTester, insertTester, deleteTester }; // List的操作有迭代、随机访问、插入和删除
		test(testers, list);
	}

	public static void test(Tester[] testers, List<String> list) {
		for (int i = 0; i < testers.length; i++) {
			System.out.print(testers[i].getOperation() + "操作: ");
			long start = System.currentTimeMillis();
			testers[i].test(list);
			long end = System.currentTimeMillis();
			System.out.print("花费" + (end - start) + "ms");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		List<String> list = null;

		System.out.println("--------测试数组--------");
		String[] ss = new String[TIMES];
		Arrays.fill(ss, "Java");
		list = Arrays.asList(ss);
		testArray(list);

		ss = new String[TIMES];
		List<String> co = Arrays.asList(ss);

		System.out.println("--------测试Vector--------");
		List<String> lv = new Vector<String>();
		lv.addAll(co);
		testList(lv);

		System.out.println("--------测试LinkedList--------");
		List<String> lk = new LinkedList<String>();
		lk.addAll(co);
		testList(lk);

		System.out.println("--------测试ArrayList--------");
		List<String> al = new ArrayList<String>();
		al.addAll(co);
		testList(al);
	}

}

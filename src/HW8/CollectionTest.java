package HW8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;


//印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)

public class CollectionTest {
	public static void main(String[] args) {
		//由於有重複元素，選擇ArrayList集合
		ArrayList list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		// 迭代器
		System.out.println("=====迭代器=====");
		Iterator objs = list.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());

		// 傳統for迴圈
		System.out.println("=====for迴圈=====");
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}

		// for-each迴圈
		System.out.println("=====for-each迴圈=====");
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}

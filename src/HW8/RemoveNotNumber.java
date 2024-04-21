package HW8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

public class RemoveNotNumber {
	public static void main(String[] args) {
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
		
		//去除不是Number的相關物件
		list.removeIf(obj -> !(obj instanceof Number));
		
		//使用for-each印出結果
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}

package HW8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TrainMain {
	public static void main(String[] args) {
		// 印出不重複的Train物件，使用HashSet
		System.out.println("=========印出不重複的Train物件========");
		HashSet<Train> hs = new HashSet<Train>();
		hs.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		hs.add(new Train(1254, "區間", "屏東", "基隆", 700));
		hs.add(new Train(118, "自強", "高雄", "台北", 500));
		hs.add(new Train(1288, "區間", "新竹", "基隆", 400));
		hs.add(new Train(122, "自強", "台中", "花蓮", 600));
		hs.add(new Train(1222, "區間", "樹林", "七堵", 300));
		hs.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		//使用迭代器印出
		Iterator objs = hs.iterator();
		while (objs.hasNext()) {
			System.out.println(objs.next());
		}
		
		//使用ArrayList
		System.out.println("\n========以班次編號由大到小印出=========");
		ArrayList<Train> list = new ArrayList<Train>();
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花蓮", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		//使用Collections類別排序
		Collections.sort(list);
		//使用for迴圈印出
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);

		}

		//使用TreeSet
		System.out.println("\n========不重複並且依編號由大到小印出=========");
		TreeSet<Train> ts = new TreeSet<Train>();
		ts.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		ts.add(new Train(1254, "區間", "屏東", "基隆", 700));
		ts.add(new Train(118, "自強", "高雄", "台北", 500));
		ts.add(new Train(1288, "區間", "新竹", "基隆", 400));
		ts.add(new Train(122, "自強", "台中", "花蓮", 600));
		ts.add(new Train(1222, "區間", "樹林", "七堵", 300));
		ts.add(new Train(1254, "區間", "屏東", "基隆", 700));

		//轉換為ArrayList，使其輸出與上方的相同
		ArrayList<Train> list1 = new ArrayList<Train>(ts);
		for (Object obj : list1) {
			System.out.println(obj);
		}
	}
}

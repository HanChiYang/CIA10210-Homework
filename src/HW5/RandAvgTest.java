package HW5;

//請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class RandAvgTest {
	public static void main(String[] args) {
		System.out.println("本次亂數結果：");
		Numbers n = new Numbers();
		//呼叫方法
		n.randAvg();
	}
}

class Numbers {
	
	//無參數建構子
	public Numbers() {

	}

	public void randAvg() {

		int[] randArray = new int[10];
		int sum = 0;

		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = (int) (Math.random() * 101); //共101個數字
			System.out.print(randArray[i] + " ");
			sum = sum + randArray[i];
		}
		System.out.println();
		System.out.println("平均值為:" + sum / 10);

	}

}

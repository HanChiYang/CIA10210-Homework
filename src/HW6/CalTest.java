package HW6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		try {
			Calculator c = new Calculator();
			Scanner sc = new Scanner(System.in);
			int x, y;
			
			//使用while迴圈，若為有效數值則脫離迴圈
			while (true) {
				try {
					System.out.println("請輸入x值");
					x = sc.nextInt();
					break;
				}
				//說明輸入格式不正確，則會有InputMismatchEception產生
				//例外處裡內容為，回報輸入格式不正確，並且清空輸入內容
				catch (InputMismatchException e) {
					 System.out.println("輸入格式不正確");
					 sc.nextLine(); 
				}
			}
			while (true) {
				try {
					System.out.println("請輸入y值");
					y = sc.nextInt();
					break;
				}
				catch (InputMismatchException e) {
					 System.out.println("請鍵入y值");
				}
			}
			
			//將結果輸出
			System.out.print(x + "的" + y + "次方為" + c.powerXY(x, y));
			
		} catch (CalException e) {
			e.printStackTrace();
		}
	}
}

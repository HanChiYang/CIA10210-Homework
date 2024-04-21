package HW5;

//請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
//此驗證碼內容包含了英文大小寫與數字的亂數組合

public class getRandomCode {
	public static void main(String[] args) {
		//將所有文字宣告為字串
		String allChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] charArray = allChar.toCharArray(); //轉為陣列
		System.out.println("本次隨機產生的驗證碼為：");
		
		//跑8次迴圈，每次隨機取得
		for (int i = 0; i <= 8; i++) {
			int ranIdx = (int) (Math.random() * allChar.length());
			System.out.print(charArray[ranIdx]);
		}
	}
}

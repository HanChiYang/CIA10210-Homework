package HW4;

//請建立一個字串，經過程式執行後，輸入結果是反過來的
//例如String s = “Hello World”，執行結果即為dlroW olleH

public class BackwardTest {
	public static void main(String[] args) {
		String s = "Hello World";
		
		char[] sArray = s.toCharArray();
		
		for(int i = (sArray.length - 1); i >= 0 ; i--) {
			System.out.print(sArray[i]);
		}
	}

}

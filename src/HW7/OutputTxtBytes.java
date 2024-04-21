package HW7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OutputTxtBytes {
	public static void main(String[] args) {
		int byteCount = 0;
		int charCount = 0;
		int lineCount = 0;

		try {
			FileReader fr = new FileReader("C:\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null) {
				byteCount += str.getBytes().length;
				charCount += str.length();
				lineCount++;
			}
            br.close();   
            fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Sample.txt檔案共有" + byteCount + "個位元組，" + charCount + "個字元，" + lineCount + "列資料");
	}

}

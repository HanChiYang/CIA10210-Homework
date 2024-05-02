package HW7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		//以上題的題目為例
		String file1 = "c:\\Random10Number.txt";//宣告輸入檔案路徑及名稱
		String file2 = "c:\\Random10Number1.txt";//宣告輸出檔案路徑及名稱
		Method m = new Method();
		m.copyFile(file1, file2);
	}
}

class Method {
	//將路徑字串宣告為參數，並帶入方法中
	void copyFile(String filePath1, String filePath2) {
		File inputFile = new File(filePath1);
		File outputFile = new File(filePath2);

		try {
			FileInputStream in = new FileInputStream(inputFile);
			FileOutputStream out = new FileOutputStream(outputFile);
			int c;
			try {
				while ((c = in.read()) != -1) {
					out.write(c);
					System.out.flush();
				}
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

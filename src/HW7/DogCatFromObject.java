package HW7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

//承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何
//(請利用多型簡化本題的程式設計)

public class DogCatFromObject {
	public static void main(String[] args) throws Exception {
		//檔案路徑輸入
		File file = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		//建立父類別Animal，並以其類別將物件反序列化，並呼叫speak()
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
			}
		} catch (EOFException e) {
			System.out.println("讀取完畢");
		}
		//關閉資源
		ois.close();
		fis.close();
	}
}

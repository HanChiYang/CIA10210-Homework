package HW4;

//班上有8位同學，他們進行了6次考試結果如下：
//請算出每位同學考最高分的次數

public class RankTest {
	public static void main(String[] args) {
		//以二維陣列宣告各同學每次考試結果
		int[][] testArray = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		//比較各同學每次的成績，並求得各次考試最高的同學索引值
		int[] highestSc = new int[6];	//預設陣列中的數值為0
		int[] stSc = new int[6];		//最高分數同學的索引值陣列
		for (int i = 0; i < (testArray.length); i++) {
			for (int j = 0; j < (testArray[i].length); j++) {
				if (testArray[i][j] > highestSc[i]) { 
					highestSc[i] = testArray[i][j]; 	//比較考試結果，若較高則取代陣列中的最高分數
					stSc[i] = j; 	//將各次考試最高的同學索引值加入至stSc陣列中
				}
			}
		}
		
		//將各同學第一名的次數進行統計
		int[] stRk = new int[8];
		for (int i = 0; i < stSc.length; i++) {
			stSc[i] = stRk[stSc[i]]++; //將索引值放入stRk陣列，並將次數+1
		}
		
		//印出各學生第一名的次數
		for (int i = 0; i < stRk.length; i++) {
			System.out.println("學生" + (i + 1) + "的第一名次數為" + stRk[i]);
		}

	}

}
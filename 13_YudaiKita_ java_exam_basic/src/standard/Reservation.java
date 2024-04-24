package standard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reservation {
	public static void main(String[] args) throws IOException {
		
		System.out.println("ようこそ浅草ジャマイカホールへ！\n\n\n");
		//配列を準備
		boolean[] book = new boolean[30];
		//要素の値が15と21の場合にtrue
		book [14] = true;
		book [20] = true;
		//Arrays.fill(book,true);
		
		//count変数の初期化
		int count = 0;
			//iが30未満の場合、繰り返す
			for (int i = 0; i < book.length; i++) {
				//空席の場合、count変数を一つ増やす
				if (book[i] == false) {
					count++;
				}
			}
		if (count == 0) {
			//countの値が0だった場合に処理
			System.out.println("完売しています。\n\n\n");
		} else if (count < 14) {
			//countの値が15未満だった場合に処理
			System.out.println("残りあと数席です。\n\n\n");
		} else {
			//いずれの条件も満たさない場合に処理
			System.out.println("まだ余裕があります。\n\n\n");
		}
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
			
		System.out.println("何番の座席を予約しますか？（1～30）\n");
		System.out.print('>');
			
		String str = reader.readLine();
		int seat = Integer.parseInt(str);
			
		System.out.println(" \n\n\n ");
			
		if ( book[seat] ) {
			//trueの場合の処理
			System.out.println("※予約済みの座席です。他の座席を選択してください。");
		} else {
			//false場合の処理
			System.out.println("座席の予約が完了しました。");
		}
	}
}

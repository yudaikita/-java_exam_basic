package enhancement;

import java.io.BufferedReader;
import java.io.IOException ;
import java.io.InputStreamReader;

public class Reservation {
	public static void main(String[] args) throws IOException {
		
		System.out.println("ようこそ浅草ジャマイカホールへ！\n\n\n");
		
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("何番の座席を予約しますか？（1～30）\n");
		System.out.print('>');
		
		//入力した文字列をstrに読み込む
		String str = reader.readLine();
		//入力した文字列を数値に変換
		int seat = Integer.parseInt(str);
		
		System.out.println(" \n\n\n ");
		
		//配列を準備
		boolean[] book = new boolean[30];
		
		//要素の値が15と21の場合（要素から1引いた数が添え字）にtrue
		book [14] = true;
		book [20] = true;
		
		//入力した数値を添え字にする条件
		if ( book[seat-1] ) {
			//trueの場合の処理
			System.out.println("※予約済みの座席です。他の座席を選択してください。");
		} else {
			//false場合の処理
			System.out.println("座席の予約が完了しました。");
		}
	}
}
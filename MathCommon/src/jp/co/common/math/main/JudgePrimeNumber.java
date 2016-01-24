package jp.co.common.math.main;

import jp.co.common.math.util.RequireInput;

/**
 * 素数かどうかを表示します。
 */
public class JudgePrimeNumber{

	/**
	 * メインメソッド。
	 * @param args 引数
	 */
	public static void main(String[] args) {
		int number;

		System.out.println("[素数判定プログラム]");
		number = RequireInput.in.getInt("数を入力してください(2以上)");

		if(number < 2) {
			System.out.println("1以下の数が入力されました。");
		} else if(number == 2) {
			System.out.println(number +"は素数です。");
		} else {
			boolean isSosuu = true;
			for(int i = 2; i <= number - 1; i ++) {
				if(number % i == 0) {
					// 割り切れた場合は素数ではない
					isSosuu = false;
					break;
				}
			}

			if(isSosuu) {
				System.out.println(number + "は素数です。");
			} else {
				System.out.println(number + "は素数ではありません。");
			}
		}
	}
}
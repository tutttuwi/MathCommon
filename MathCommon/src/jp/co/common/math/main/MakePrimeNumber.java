package jp.co.common.math.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import jp.co.common.math.util.RequireInput;

public class MakePrimeNumber {

	/**
	 * メインメソッド。
	 * @param args 引数
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int upNum;

		System.out.println("[素数作成プログラム]");
		upNum = RequireInput.in.getInt("上限値を設定してください"
				+ "\n"
				+ "指定された値までの素数を作成します");
		Integer[] primeNums = new Integer[upNum];
		//2は素数なのでまず代入しておく
		primeNums[0] = 2;
		//以降、上限値まで処理
		int primeNum = 3;
		int divNum = 2;
		int idx = 1;
		while(true){
			if (primeNum%divNum == 0){
				++primeNum;
				if(primeNum == upNum){
					//検索上限値まで達している場合ループから抜ける
					break;
				}
				divNum = 2;
				continue;
			}

			//割数をインクリメント
			++divNum;
			//対象数字と割数が等しければ
			if (primeNum == divNum || primeNum/2 < divNum){
				//素数であると判定し、値を格納します
				primeNums[idx] = primeNum;
				//インクリメント
				++idx;
				++primeNum;
				if(primeNum == upNum){
					//検索上限値まで達している場合ループから抜ける
					break;
				}
				//初期化
				divNum = 2;
			}
		}
		List<Integer> list = new ArrayList<>(Arrays.asList(primeNums));

		list.removeAll(Collections.singleton(null));
		Object tmp[] = (Object[])list.toArray();
		System.out.println("検索結果 ： " + Arrays.toString(tmp));

	}

}

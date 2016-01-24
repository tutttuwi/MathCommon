package jp.co.common.math.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 入力を簡便に行うためのクラスです。
 */
public class MyReader {
	/**
	 * バッファードリーダー。
	 */
	private BufferedReader bufferedReader;
	/**
	 * プロンプト文字列。
	 */
	private String prompt = "? ";

	/**
	 * コンストラクタ。
	 */
	public MyReader() {
		this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * プロンプト文字列を返します。
	 * @return プロンプト文字列
	 */
	public String getPrompt() {
		return this.prompt;
	}

	/**
	 * プロンプト文字列を設定します。
	 * @param prompt プロンプト文字列を返します。
	 */
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	/**
	 * 文字列の入力を受け付けます。
	 * @param question 表示文字列
	 * @return 入力文字列
	 */
	public String getString(String question) {
		System.out.print(question + this.prompt);
		String input = "";

		try {
			input = this.bufferedReader.readLine();
		} catch(IOException e) {
			// System.in のため起こり得ない
			; // 何もしない
		}
		return input;
	}

	/**
	 * boolean型の入力を受け付けます。
	 * @param question 表示文字列
	 * @return 値
	 */
	public boolean getBoolean(String question) {
		boolean input;
		String base = this.getString(question);
		input = Boolean.parseBoolean(base);
		return input;
	}

	/**
	 * byte型の入力を受け付けます。
	 * @param question 表示文字列
	 * @return 値
	 */
	public byte getByte(String question) {
		byte input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Byte.parseByte(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}

	/**
	 * short型の入力を受け付けます。
	 * @param question 表示文字列
	 * @return 値
	 */
	public short getShort(String question) {
		short input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Short.parseShort(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}

	/**
	 * int型の入力を受け付けます。
	 * @param question 表示文字列
	 * @return 値
	 */
	public int getInt(String question) {
		int input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Integer.parseInt(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}

	/**
	 * long型の入力を受け付けます。
	 * @param question 表示文字列
	 * @return 値
	 */
	public long getLong(String question) {
		long input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Long.parseLong(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}

	/**
	 * char型の入力を受け付けます。
	 * @param question 表示文字列
	 * @return 値
	 */
	public char getChar(String question) {
		char input;
		while(true) {
			String base = this.getString(question);
			if(base.length() == 1) {
				input = base.charAt(0);
				break;
			}
		}
		return input;
	}

	/**
	 * float型の入力を受け付けます。
	 * @param question 表示文字列
	 * @return 値
	 */
	public float getFloat(String question) {
		float input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Float.parseFloat(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}

	/**
	 * double型の入力を受け付けます。
	 * @param question 表示文字列
	 * @return 値
	 */
	public double getDouble(String question) {
		double input;
		while(true) {
			String base = this.getString(question);
			try {
				input = Double.parseDouble(base);
			} catch(NumberFormatException e) {
				continue;
			}
			break;
		}
		return input;
	}
}
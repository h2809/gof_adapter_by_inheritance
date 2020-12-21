
public class Main {

	public static void main(String[] args) {
		// アダプタのインスタンス生成
		Print p = new PrintBanner("Hello");

		// アダプタのメソッド呼び出し
		p.printWeak();
		p.printStrong();
	}

}

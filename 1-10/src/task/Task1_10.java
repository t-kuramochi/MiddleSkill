package task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("問１");
		//問題1:配列"numa"の要素を全要素を出力しなさい。※i++など利用しないfor文で記述すること

		int[] numa = { 1, 2, 3, 4, 5 };
		for (int i : numa) {
			System.out.println(i);
		}

		System.out.println("問2");
		//問題2:配列"numb"の要素を逆順に出力してください。

		for (int i = numa.length - 1; i >= 0; i--) {
			System.out.println(numa[i]);
		}

		System.out.println("問3");
		//問題3:配列"numc"の中で偶数の要素だけを合計した値を出力してください。

		int sum = 0;
		for (int numas : numa) {
			if (numas % 2 == 0) {
				sum += numas;
			}
		}
		System.out.println(sum);

		System.out.println("問4");
		//問題4:この配列"numd"をコピーした配列名"new_numd"を作り"new_numd"の中身を出力してください。

		int[] numd = { 1, 3, 5, 7, 9 };
		int[] new_numd = Arrays.copyOf(numd, 5); //これでコピー
		System.out.println(Arrays.toString(new_numd));

		System.out.println("問５");
		int[] nume = { 6, 2, 8, 1, 9 };
		Arrays.sort(nume);
		System.out.println(Arrays.toString(nume));

		System.out.println("問6");
		//問題6:配列"numf"に要素を1つ(10)追加した配列"new_numf"を作成し出力しなさい。
		int[] numf = { 1, 3, 5, 7, 9 };
		int[] new_numf = new int[numf.length + 1];

		int i = 0;
		for (i = 0; i < numf.length; i++) {
			new_numf[i] = numf[i];
		}

		new_numf[new_numf.length - 1] = 10;

		System.out.println(Arrays.toString(new_numf));

		System.out.println("問7");
		/*問題7:Map"car"に「キー："honda"　バリュー"ホンダ",
		キー："toyota"　バリュー："トヨタ",
		キー："subaru"　バリュー："スバル"」の要素を追加してください
		*/

		Map<String, String> car = new HashMap<String, String>() {
			{
				put("honda", "ホンダ");
				put("toyota", "トヨタ");
				put("subaru", "スバル");
			}
		};

		System.out.println("問8");
		//問題8:Map"car"の「キー："toyota"」のバリューを出力してください。
		System.out.println(car.get("toyota"));

		System.out.println("問9");
		//問題9:Map"car"のキーとバリューを全て出力してください。※for文で行うこと
		for (Map.Entry<String, String> entry : car.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("問10");
		//問題10:Map"car"のキーとバリューを全て出力してください。※forEach文で行うこと

		car.forEach((key, val) -> {
			System.out.println(key + " : " + val);
		});

	}

}

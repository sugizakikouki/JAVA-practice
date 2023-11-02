package sugizaki;

public class SubstringSample6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str="文字列1,String Two,あいう";
		String[] strs=str.split(",");
		System.out.println(String.format("分割前の文字列：%s", str));
		for(int i=0;i<strs.length; i++) {
			System.out.println(String.format("分割後%d個目の文字列->%s", i+1, strs[i]));
		}
	}

}

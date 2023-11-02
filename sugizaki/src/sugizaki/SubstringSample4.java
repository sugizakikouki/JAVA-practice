package sugizaki;

public class SubstringSample4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str="氏名：山田太郎";
		int index=str.indexOf("：");
		System.out.println("取り出し文字列->"+str.substring(index+1));
		str="氏名->山田太郎";
		index=str.indexOf("->");
		index+="->".length();
		System.out.println("取り出し文字列->"+str.substring(index));
	}

}

package sugizaki;

public class ConcatSample4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	      String str1 = "文字列１";
	      String str2 = "文字列２";
	      StringBuilder sb = new StringBuilder();
	      sb.append(str1);
	      sb.append(str2);
	      String str = sb.toString();
	      System.out.println("StringBuilderによる文字列の連結-> " + str);
	}

}

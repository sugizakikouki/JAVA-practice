package sugizaki;

public class SubstringSample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	    String str = "壱２34伍６７89０";
	    System.out.println(String.format("取り出し前の文字列 ： %s", str));
	    System.out.println("文字列の3文字目から7文字目を取り出す -> " + str.substring(2,7));
	    System.out.println("文字列の2文字目から2文字目を取り出す -> " + str.substring(1,2));
	    System.out.println("文字列の3文字目から3文字分を取り出す -> " + str.substring(2,2+3));
	}

}

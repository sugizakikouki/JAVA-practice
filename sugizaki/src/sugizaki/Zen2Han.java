package sugizaki;

public class Zen2Han {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "ａｂ漢字ｃＤディーefＧＨＩJｚＺ!$&";
		System.out.println("変換前:"+str);
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char c=str.charAt(i);
			if('a'<=c&&c<='z') {
				c=(char)(c-'a'+'a');
			}else if('A'<=c&&c<='Z') {
				c=(char)(c-'A'+'A');
			}
			sb.append(c);
		}
		System.out.println("変換後:"+sb.toString());
	}
}
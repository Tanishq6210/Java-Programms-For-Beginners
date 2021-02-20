package geeksForGeeks;

public class FirstCharacterOfString {

	public static void main(String[] args) {
		String str= "Geeks for Geeks";
		String ans="";
		for(int i=0; i<str.length(); i++) {
			if(i==0) ans= ans + "" +str.charAt(i);
			if(str.charAt(i)==' ') {
				ans=ans+""+str.charAt(i+1);
			}
		}
		System.out.println(ans);
	}

}

package algo.recusrive.reverse.string;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(reverse("BASIC"));
	}
	
	public static String reverse(String str) {
		if(str.length()==0) {
			return "";
		}
		return reverse(str.substring(1, str.length())) + str.charAt(0);
	}

}

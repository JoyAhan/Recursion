package algo.recusrive.subsequence;

public class Subsequence {
	
	public static void main(String[] args) {
		System.out.println(getSubsequence("abc"));
	}
	
	private static String getSubsequence(String str) {
		
		if(str.length() == 0) {
			return "";
		}
		
		char first = str.charAt(0);
		String rest = getSubsequence(str.substring(1));
		String result = "";
		for(String subsequence : rest.split(",",-1)){
			result = result +  "," + first + subsequence ;
			result = result + "," + subsequence;
		}
		
		return result.substring(1);
		
	}

}

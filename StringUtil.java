
public class StringUtil {
	private StringUtil() {}
	public static String titleCase(String s) {
		String retStr="";
		if(s!=null && s.trim().length()>0) {
				String strArr[]=s.split(" ");
				for(String word:strArr ) {
					retStr+=String.valueOf(word.charAt(0)).toUpperCase()+word.substring(1).toLowerCase()+" ";
				}
		}
		
		return retStr;
	}
	

}

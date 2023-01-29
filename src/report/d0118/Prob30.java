package report.d0118;

import java.util.*;

class ReverseString{
	///field
	///constructor
	///method
	public static List<String> dataChange(String[] strData) {
		List<String> result = new Vector<String>(strData.length,10);
		for(int i=0; i<strData.length; i++) {
			String tmp = "";
			for(int j=0; j<strData[strData.length-i-1].length(); j++) {
				tmp += strData[strData.length-i-1].charAt(strData[strData.length-i-1].length()-j-1);
			}
			result.add(tmp);
		}
		
		return result;
		
	}
}
public class Prob30 {

	public static void main(String[] args) {
		String[] strData= {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
		List<String> l = ReverseString.dataChange(strData);
		for (String s : l) {
			System.out.println(s);
		}
	}

}

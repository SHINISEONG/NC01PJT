package report.d0118;

public class Prob29 {
	///field
	///constructor
	///method
		private static String[] stringSpilit(String str, String csv) {
			int cnt=0;
			
			String tmp="";
			for (int i = 0; i<str.length(); i++) {
				if(str.charAt(i)==csv.charAt(0)) {
					cnt++;
				}
			}
			
			int cntMax=cnt;
			String[] result = new String[cnt+1];
			cnt=0;
			
			for (int i = 0; i<str.length(); i++) {
			
				if(str.charAt(i)==csv.charAt(0)) {
					result[cnt]=tmp;
					tmp="";
					cnt++;
				
					if(cnt==cntMax) {
						result[cntMax] = str.substring(i+1,str.length());
					}

				} else {
					tmp+=str.charAt(i);
				}
				
			}
			return result;
		}
	///main
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strArray = stringSpilit(str,"#");
		for(String s : strArray) {
			System.out.println(s);
		}
	}

}

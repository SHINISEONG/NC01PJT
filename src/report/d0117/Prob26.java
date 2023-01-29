package report.d0117;

class StringUtil {
	/// field
	/// constructor
	/// method
	public static String replaceString(String[] arr) {
		String result = "";
		int[] cnt = new int[arr.length];
		int max = 0;
		int locator = 0;
		char tmp = ' ';

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'a') {
					cnt[i]++;
				}
			}
		}

		max = cnt[0];
		for (int i = 1; i < cnt.length; i++) {
			if (max < cnt[i]) {
				max = cnt[i];
				locator = i;
			}
		}

		for (int i = 0; i < arr[locator].length(); i++) {
			if (arr[locator].charAt(i) == 'a') {
				tmp = 'A';
			} else {
				tmp = arr[locator].charAt(i);
			}
			result += tmp;
		}

		return result;
	}
}

public class Prob26 {
	public static void main(String[] args) {
		String[] arr = { "java program", "array", "java program area", "append" };
		String result = StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 " + result);
	}
}

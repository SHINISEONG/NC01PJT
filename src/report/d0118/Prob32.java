package report.d0118;

import java.io.*;

class FileCalculator {
	/// field
	/// constructor
	/// method
	public static void addCalculateResult(String fileAddr) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(fileAddr));
		int sum = 0;
		int multiply = 1;
		int n = 0;
		String s = "";
		while (true) {
				
				s = br.readLine();
				if(s == null) {
					break;
				}
				n = Integer.parseInt(s);
				sum += n;
				multiply *= n;
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileAddr,true));
		bw.write(sum+"\n");
		bw.write(multiply+"\n");
		bw.flush();
		bw.close();
		br.close();
	}//end of method
}// end of class

public class Prob32 {

	public static void main(String[] args) throws Exception {
		FileCalculator.addCalculateResult("D:\\test.dat");
	}// end of main

}/// end of app class

package script.d14;



import java.io.*;

public class FileWriterTestFilter02
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = null;
		BufferedWriter bw = null;

		br = new BufferedReader(new InputStreamReader(System.in));

		bw = new BufferedWriter(new FileWriter("test.txt"));
	
	System.out.println("파일에 저장하실 글을 입력하세요.");
	while(true){
		String str = br.readLine();
		if(str.equals("끝")){
			break;
		}
		bw.write(str,0,str.length());
		bw.newLine();
	}
	bw.flush();

	br.close();
	bw.close();
}
}

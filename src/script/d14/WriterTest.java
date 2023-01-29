package script.d14;

//package jp03.part02;

import java.io.*;

public class WriterTest {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		Reader reader = new InputStreamReader(inputStream);

		OutputStream outputStream = System.out;

		Writer writer = new OutputStreamWriter(outputStream);
		try {
			
			

			System.out.println("입력을 기다립니다.....");

			while (true) {
				int i = reader.read();
				writer.write(i);
				//writer.flush();

				if ((char) i == 'x') {
					break;
				}
			}

			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		writer.flush();
	}//end of main
}
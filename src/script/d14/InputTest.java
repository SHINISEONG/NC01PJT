package script.d14;



import java .io.*;

public class  InputTest
{
	public static void main(String[] args) 
	{
		
		InputStream inputStream = System.in;

		System.out.println("�Է��� ��ٸ��ϴ�.....");

		try{
			while(true){
				
				int i = inputStream.read();
				char c = (char) i;

				System.out.println("�Է��Ͻ� �� : "+c);

				if(c=='x'){
					inputStream.close();
					break;
				}
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
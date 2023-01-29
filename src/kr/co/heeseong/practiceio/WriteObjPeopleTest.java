package kr.co.heeseong.practiceio;

import java.io.IOException;

public class WriteObjPeopleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		WriteObjPepleVo.writeObj("Ω≈»Òº∫", 20, 11234);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

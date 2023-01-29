package kr.co.heeseong.practiceio;

import java.io.Serializable;

public class PeopleVO implements Serializable {
	///field
	private String name;
	private int age;
	private final int serialNo;
	///constructor
	
	public PeopleVO(String name, int age, int serialno) {
		super();
		this.name = name;
		this.age = age;
		this.serialNo = serialno;
	}
	/// method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSerialno() {
		return serialNo;
	}

	@Override
	public String toString() {
		return "PeopleVO [name=" + name + ", age=" + age + ", serialNo=" + serialNo + "]";
	}
	
}

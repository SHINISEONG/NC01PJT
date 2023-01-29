package shop.service.user;

public class Client {
///field
	public String name;
	String age;
	private int pwd;
	protected String add;
	public boolean gender;
	public static final String NATIONALITY = "¥Î«—πŒ±π";
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String name, String age, int pwd, String add, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.pwd = pwd;
		this.add = add;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", age=" + age + ", pwd=" + pwd + ", add=" + add + ", gender=" + gender + "]";
	}

}

package map;

public class Member {
	private String name;
	private String addr;
	private String age;
	private String id;
	private String pass;
	
	
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	public String getAge() {
		return age;
	}
	public String getId() {
		return id;
	}
	public String getPass() {
		return pass;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "회원정보 [이름=" +name+", 주소=" +addr+ ", 나이=" +age+ "아이디=" +id+ "비번=" +pass;
	}
}

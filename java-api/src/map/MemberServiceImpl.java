package map;

import java.security.Provider.Service;
import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService {
	Map<String, Object> map = new HashMap<String, Object>();
	Member member = new Member();

	@Override
	public void join(String id, String pass, String name, String age, String addr) {
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setAge(age);
		member.setAddr(addr);
		map.put(id, member);
	}

	@Override
	public String login(String id, String pass) {
		String result = null;
		/**
		 * 환영한다. 서울에 사는 독거노인 길동아. 비번이 다르다. 다시 입력 입력한 아이디는 상대성 이론에 따라 안드로메다로 Map
		 * 에서 value 값만 가져오는 메소드는 map.get("key 값")
		 */

		if (map.containsKey(id)) {
			Member temp = new Member();
			temp = (Member) map.get(id);
			if (temp.getId().equals(id) ) {
				result = "환영합니다. " + temp.getAddr() + "에 사는 " + temp.getAge() + "세 " + temp.getName() + "씨";
			} else if (!temp.getPass().equals(pass)) {
				result = " 입력한 비번 틀렸다";
			} else {
				result = " 입력한 아이디 안드로메다";
			}
		}
		return result;
	}

	@Override
	public int count() {
		int num = 0;
		return num;
	}

	@Override
	public Member searchById(String id) {

		return null;
	}

}

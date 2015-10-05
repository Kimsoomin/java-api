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
			if (temp.getId().equals(id)&&temp.getPass().equals(pass)) {
				result = "환영합니다. "+temp.getAddr()+"에 사는 "+temp.getAge()+"세 "+temp.getName()+"님";
			} else {
				result = "입력한 정보가 틀렸습니다.";
			}
		}
		return result;
	}

	@Override
	public int count() {
		
		return map.size();
	}
	/*
	 * ID 로 회원검색
	 */

	@Override
	public Member searchById(String id) {
		Member temp = (Member) map.get(id);
		Member result = null;
		if (id.equals(temp.getId())) {
			result = temp;
		}		
		return result;
		
		//		return (Member) map.get(id);
	}

	@Override
	public String changePass(String id, String pass) {
		String result = null;
		Member target = (Member) map.get(id);
		if (target != null) {
			target.setPass(pass);
			result = "비밀번호 변경되었습니다.";
		} else {
			result = "비민번호가 변경되지 않았습니다.";
		}
		return result;
	}

	@Override
	public String remove(String id) {
		Member temp = (Member) map.get(id);
		String result = null;
			if (temp.getId().equals(id)) {
				map.remove(id);
				result = "입력하신 ID "+temp.getId()+ "를 삭제하였습니다";
			} else {
				result = "입력한 정보가 틀렸습니다.";
			}

		return result;
		/*
		 * String result = null;
		 * object m = map.remove(id);	리턴값이 value
		 * if ( m != null ){
		 * result = "입력한 id 가 삭제"
		 * }else{
		 * }
		 * return result
		 * }
		 */
	}
}

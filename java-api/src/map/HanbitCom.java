package map;

import java.util.Scanner;

public class HanbitCom {
	/**
	 * "안녕하세요" .substring(0.2); => 0이상 2미만 "안녕" 
	 * "안녕하세요" .substring(1.3); => 1이상 3미만 "녕하"
	 */

	public static void main(String[] args) {
		/**
		 * CRUD
		 * Create : 추가
		 * Read   : 검색
		 * Update : 수정
		 * Delete : 삭제
		 */
		Scanner scanner = new Scanner(System.in);
		MemberService service = MemberServiceImpl.getInstance();
		Member m = new Member();
		while (true) {
			System.out.println("1번.회원가입 2.로그인 3.총회원수 4.ID검색 5.비번수정 6회원탈퇴 .7.종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("아이디");
				String id = scanner.next();
				System.out.println("비번");
				String pass = scanner.next();
				System.out.println("이름");
				String name = scanner.next();
				System.out.println("나이");
				String age = scanner.next();
				System.out.println("주소");
				String addr = scanner.next();
				service.join(id, pass, name, age, addr);
				break;
			case 2:
				System.out.println("아이디 입력");
//				String result = service.login(scanner.next(), scanner.next());
				String id2 = scanner.next();
				System.out.println("비밀번호 입력");
				String pass2 = scanner.next();
				System.out.println(service.login(id2, pass2));
/*				String flag = result.substring(0,2);
				switch (flag) {
				case "환영":	// 현실에서는 로그인 페이지 전환
					break;
				case "비번":	// 현실 로그인 페이지 다시 보여줌
					break;
				case "입력":	// 현실 회원가입 페이지
					break;
				default:
					break;
				}*/
				break;
			case 3:
				System.out.println(service.count());
				break;
			case 4:
				System.out.println("검색할 아이디 입력");
				System.out.println(service.searchById(scanner.next()));
				break;
			//	
			case 5:
				System.out.println("ID: ");
				id = scanner.next();
				System.out.println("Pass");
				pass = scanner.next();
				System.out.println(service.changePass(id, pass));
				break;
			case 6:
				System.out.println("삭제할 ID 입력");
				String delete = scanner.next();
				System.out.println(service.remove(delete));
				break;
			case 7:
				break;
			default:
				break;
			}
		}
	}
}

package enums;

import java.util.List;

/**
 * @file_name : Toysrus.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 7.
 * story      : 장난감 가게에서 신규로 들어온 상품 등록과 검색
 */
public class Toysrus {
	/**
	 * 장난감이 입고 되었을 때, 점원이 바코드번호로 등록 
	 * 1. setBarcode() 	: 123456
	 * 2. setName()		: 상품명 등록(Enum에 있는 이름)
	 * 3. setUser()		: 어른용, 어린이용
	 * 4. setType()		: 피규어, 인형
	 */
	
/*	public static void main(String[] args) {
		System.out.println("장난감을 등록해 주세요"
				+ "\n 1: 바코드 등록(1111-스파이더맨, 2222-신데렐라)"
				+ "\n 2: 조회 3: 총수량 4: 종료");
		while (true) {
			
		}
	}*/
	public static void main(String[] args) {
		ToyRegister tr = new ToyRegister();
		ToySpec spec = new ToySpec();
		spec.setMap("사용자",ToyUser.어른용);
		spec.setMap("타입",ToyType.피규어);
		tr.regist("스파이더맨", 5000, spec);
		List<Toy> list = tr.getAll();
		for (Toy toy: list) {
			System.out.println("====");
		}
		// 이름으로 조회
//		tr.searchName("스파이더맨");
		System.out.println(tr.searchName("스파이더맨"));
	}
}

package grade;

import java.util.Scanner;

public class HanbitSchool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();
		while (true) {
			System.out.println("1.성적등록 2.학적부리스트보기 3.학번으로검색 4.이름으로검색 5.성적순위출력 6.이름순출력 7.종료");
			switch (scanner.nextInt()) {
			case 1: 
			System.out.println("학번 입력");
			String hak = scanner.next();
			System.out.println("이름 입력");
			String name = scanner.next();
			System.out.println("국어");
			int kor = scanner.nextInt();
			System.out.println("영어");
			int eng = scanner.nextInt();
			System.out.println("수학");
			int math = scanner.nextInt();
			service.input(hak, name, kor, eng, math);

			
			break;
			case 2: 
			System.out.println(service.getList());
				break;
			case 3: 
			System.out.println("학번 검색");
			String searchhak = scanner.next();
			service.searchByHak(searchhak);
			System.out.println(service.searchByHak(searchhak));
				break;
			case 4:
			System.out.println("이름 검색");
			String searchname = scanner.next();
			service.searchByHak(searchname);
			System.out.println(service.searchByName(searchname));
				break;
			case 5: 
				System.out.println(service.descGradeByTotal());
				break;
			case 6: 
				break;
			case 7: 
				return;
			default:break;

			}
			
		}
	}
}

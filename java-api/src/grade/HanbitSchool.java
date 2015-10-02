package grade;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class HanbitSchool {
	private static final int Grade = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();
		while (true) {
			System.out.println("1.성적등록 2.학적부리스트보기 3.학번으로검색 4.이름으로검색 5.성적 상위순으로 순위출력 6.성적 하위순으로 순위 출력(스왑) 7.이름으로 오름차순 출력 8.종료");
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
			case 5: service.descGradeByTotal();
				System.out.println(service.descGradeByTotal());
				break;
			case 6: service.acsGradeByTotal();
					ArrayList<Grade> score = service.ascGradeByTotal();
					for (int i = 0; i < score.size(); i++) {
						System.out.println(score.get(i).getTotal());
					}
				break;
			case 7: service.ascGradeByName();
					ArrayList<Grade> name1 = service.getList();
					for (int i = 0; i < name1.size(); i++) {
						System.out.println(name1.get(i).getName());
					}
				return;
			case 8 :
				return;
			default:break;

			}
			
		}
	}
}

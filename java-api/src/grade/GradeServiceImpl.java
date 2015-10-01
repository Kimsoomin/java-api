package grade;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	
	/**
	 * 학생을 학적부에 등록하기 힌트) 벡터 메소드 중에 한 객체만 넣는 메소드 사용 =연산자는 안됨.
	 * 한줄 코딩으로 끝
	 */
	
	Vector<Grade> vec = new Vector<Grade>();
	
	@Override
	public void input(String hak, String name, int kor, int eng, int math) {
		Grade grade = new Grade();
		// 학번 이름 국어 영어 수학 입력
		grade.setHak(hak);
		grade.setName(name);
		grade.setKor(kor);
		grade.setEng(eng);
		grade.setMath(math);

		vec.add(grade);
		
	}
	
	/**
	 * 학적부에 등록된 전체 학생 리스트 출력
	 * 힌트) 필드에 있는 개체에 모든 학생 리스트가 있을 것이다. 
	 * 필드 객체 값을 지연변수에 할당하자
	 */
	
	@Override
	public Vector<Grade> getList() {	//지우면 된다?
		return vec;
	}
	/**
	 * 학번으로 벡터를 뒤져서 일치하는 학번 한개만 리턴하기
	 */
	@Override
	public Grade searchByHak(String hak) {
		Grade grade = new Grade();
		for (int i = 0; i < vec.size(); i++) {	// 1000 대신에 벡터의 length 를 구하는 메소드 찾아 볼 것.
			if (vec.elementAt(i).getHak().equals(hak)) {
				grade = vec.elementAt(i);
			} 
		}
		return grade;
	}
	/**
	 * 이름으로 학적부에 등록된 학생정보 전부 검색하기(동명이인일 경우 전부 검색)
	 */
	@Override
	public Vector<Grade> searchByName(String name) {
		Vector<Grade> temp = new Vector<>();
		for (int i = 0; i < vec.size(); i++) {
			if (vec.elementAt(i).getName().equals(name)) {
				temp.add(vec.elementAt(i));
			} 
		}
		return temp;
	}

	@Override
	public void descGradeByTotal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ascGradeByName() {
		// TODO Auto-generated method stub
		
	}

}

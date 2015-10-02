package grade;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class GradeServiceImpl implements GradeService{
	
	/**
	 * 학생을 학적부에 등록하기 힌트) 벡터 메소드 중에 한 객체만 넣는 메소드 사용 =연산자는 안됨.
	 * 한줄 코딩으로 끝
	 */
	ArrayList<Grade> vec = new ArrayList<Grade>();
	
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
	public ArrayList<Grade> getList() {	//지우면 된다?
		return vec;
	}
	/**
	 * 학번으로 벡터를 뒤져서 일치하는 학번 한개만 리턴하기
	 */
	@Override
	public Grade searchByHak(String hak) {
		// if - else 흑백논리
		Grade grade = new Grade();
		for (int i = 0; i < vec.size(); i++) {	// 1000 대신에 벡터의 length 를 구하는 메소드 찾아 볼 것.
			if (vec.get(i).getHak().equals(hak)) {
				grade = vec.get(i);
			} 
		}
		return grade;
	}
	/**
	 * 이름으로 학적부에 등록된 학생정보 전부 검색하기(동명이인일 경우 전부 검색)
	 */
	@Override
	public ArrayList<Grade> searchByName(String name) {
		ArrayList<Grade> temp = new ArrayList<>();
		for (int i = 0; i < vec.size(); i++) {
			if (vec.get(i).getName().equals(name)) {
				temp.add(vec.get(i));
			} 
		}
		return temp;
	}

	@Override
	public ArrayList<Grade> descGradeByTotal() {
		Grade grade = new Grade();
		Grade temp = new Grade();
		for (int i = 0; i < vec.size(); i++) {
			for (int j = 0; j < vec.size(); j++) {
				if (vec.get(i).getTotal() > vec.get(j).getTotal()) {
					temp = vec.get(i);
					vec.set(i, vec.get(j));
					vec.set(j, temp);
				}
			}
		}
		return vec;
	}

	@Override
	public ArrayList<Grade> ascGradeByName() {
		Grade temp = null;
		for (int i = 0; i < vec.size(); i++) {
			for (int j = 0; j < vec.size(); j++) {
				if (vec.get(i).getName().compareTo(vec.get(j).getName()) < 0) {
					temp = vec.get(i);
					vec.set(i, vec.get(j));
					vec.set(j, temp);				
				}
				
			}
			
		}
		return vec;
	}

	@Override
	public ArrayList<Grade> acsGradeByTotal() {
		AscTotal asctotal = new AscTotal();
		Collections.sort(vec, asctotal);
		return vec;
		
	}

	@Override
	public ArrayList<Grade> ascGradeByTotal() {
		// TODO Auto-generated method stub
		return null;
	}


}

package string;
/**
 * @file_name : StringBufferMain.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 6.
 * story      : StringBuffer 문법
 */
public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String a = "java", b = "programing";
		System.out.println(a+b); 			
		System.out.println("java"+"programing");
		System.out.println("==================");
		// 주소값 + 주소값 (주소값의 결합, 주소값 2번 호출) => 비추
		
		System.out.println(sb.append("java").append("programing"));
		// 결합시킨 하나의 주소값 참조
		// 체이닝기법
		System.out.println(sb.length());		// 실제 문자수 
		System.out.println(sb.capacity());		// 할당된 배열사이즈
		System.out.println(sb.replace(0, 4, "C++")); // (시작인덱스, 끝인덱스(불포함))
		System.out.println(sb.reverse());		// gnimargorp++C
		System.out.println(sb.reverse());		// C++programing
		System.out.println(sb.substring(11));	//11번째 인덱스부터 끝까지
		StringBuffer sb1 = new StringBuffer("홍길동");
		StringBuffer sb2 = new StringBuffer("홍길동");
		System.out.println(sb1==sb2);			// String 이라면 reference 비교 => false
		System.out.println(sb1.equals(sb2));	// String 이라면 value 비교 => true
		// StringBuffer 는 무조건 래퍼런스(주소값) 비교만 한다.
	}
}

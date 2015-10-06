package string;
/**
 * @file_name : StringMethod.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 5.
 * story      : java.lang.String
 */
public class StringMethod {
	public static void main(String[] args) {
		System.out.println("abcde".contains("f") ? "f가 존재" : "f가 존재하지 않음");
		String str1 = "abc";
		String str2 = "abc";	//abc라는 리터럴 값이 상수풀에 존재하는지 체크
		// 삼항 연산자(str1 == str2) 		밸류 비교
		// 삼항 연산자(str1.equals(str2)) 	레퍼런스(주소) 비교
		
		System.out.println(str1==str2? "str1 과 str2 같음": "str1는 str2 다름");		//같음
		System.out.println(str1.equals(str2)? "str1 과 str2 같음": "str1는 str2 다름");	//같음
		String str3 = new String("abc");	// 다름
		String str4 = new String("abc");	// 같음	
		System.out.println(str3==str4? "str3 과 str 같음": "str3 는 str4 다름");		// 다름
		System.out.println(str3.equals(str4)? "str3 과 str4 같음": "str3 는 str4 다름");// 같음
		
		/*
		 * == 		: 주소값 비교, 주소까지 같은 완전 동일 객체
		 * equals() : 실제값(value) 비교, 주소는 상관없고 이름만 동일한지 체크
		 */
		
		String str5 = "abc";
		String str6 = new String("abc");
		System.out.println(str5==str6? "str5 과 str6 같음": "str5 는 str6 다름");
		System.out.println(str5.equals(str6)? "str5 과 str6 같음": "str5 는 str6 다름");
		// "Hello.txt" 는 리터럴 객체이다.
		System.out.println("Hello.txt".endsWith("txt")? "텍스트 파일입니다." : "텍스트 파일이 아닙니다.");	// 텍스트 파일입니다.
		System.out.println("헬로우".concat(",자바월드"));	// 헬로우, 자바월드
		System.out.println("HELLO".equals("hello")?"같습니다.": "다릅니다");	// 다릅니다
		System.out.println("HELLO".equalsIgnoreCase("hello")?"같습니다.": "다릅니다");	// 같습니다.
		System.out.println("Hello Tom".replace("Tom", "Alex"));		// Hello Alex
		
		/*
		 * JDK5 버전 이전에는 replace() replaceAll() 이 서로 다르게 반응했으나
		 * 그 이후에는 서로 같은 기능 (전부 체인지)으로 바뀌었음
		 * 그럼 차이점이 없는가? 하면 정규식에 대한 기능이 있는가 없는가의 차이점이 있다.
		 * replace() 는 기능이 없고 replaceAll() 은 기능이 있다.
		 * 따라서 replaceAll() 을 쓰도록 권고되고 있다.
		 */
		
		System.out.println("[1] A B C D : A B C D".replace("C D", "E F") );		//[1] A B E F : A B E F
		System.out.println("[2] A B C D : A B C D".replaceAll("C D", "E F") );	//[2] A B E F : A B E F
		
		/**
		 * . : 정규식에서 쓰이는데 맨 앞 한글자만 지정한다.
		 * 그러니까 .a 는 a앞에 글자와 a까지를 뜻합니다.
		 * 아래 예제에서 replace()는, . 을 정규식으로 보지 않고 리터럴의 마침표로 인식함으로
		 * 프로그래밍에서 자주 사용하는 정규식을 적용 할 수 없게 됩니다.
		 * 
		 */
		
		System.out.println("[3] Hello Javan".replace("a", ""));		//[3] Hello Jvn
		System.out.println("[4] Hello Javan".replaceAll(".a", "")); //[4] Hello n
		System.out.println("Hello. Java".toUpperCase());
		System.out.println("Hello. Java".toLowerCase());
		System.out.println("Hello. Java".length());					// char와 객수반환, 공백도 갯수로 인정
		System.out.println("Hello. Java".charAt(0));
		System.out.println("Hello. Java".equalsIgnoreCase("HELLO. JAVA"));
		System.out.println(" Hello. Java ");
		System.out.println(" Hello. Java    ".trim().length());			// 트림은 앞뒤 공백 제거
		System.out.println("Hello. Java".substring(3));			
		System.out.println("Hello. Java".replaceAll(" ", "").length()); // 모든 공백 제거
		System.out.println("12");
		System.out.println(12);
		System.out.println(String.valueOf(3));		// 클래스(가) 메소드 호출
		System.out.println(String.valueOf("ab"));	// 상수풀에 있는 주소값을 가지고 있다
		// String.valueOf("ab") 의 결과값은 값 그대로인 ab를 출력한다.
		
		/**
		 * Mrapper 클래스
		 * 기본형 타입 < == > 객체형 타입
		 */
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("1");
		int i = Integer.parseInt("1");
		long l = Long.parseLong("1000");
		boolean boo = Boolean.parseBoolean("true");
		float f = Float.parseFloat("1.0");
		double d = Double.parseDouble("3.14");
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(boo);
		System.out.println(f);
		System.out.println(d);
		
		String age ="20";
		if (Integer.parseInt(age)>19) {
		}		
	}		
}

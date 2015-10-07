package exceptions;
/**
 * @file_name : ExceptionHandling.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 7.
 * story      : Exception2
 */
public class ExceptionHandling2 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int i = 50;
		try {
			int data = Integer.parseInt("a");
			System.out.println(i/data);
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("숫자가 아닙니다.");
		}
			System.out.println("프로그램 종료");
			
}
}
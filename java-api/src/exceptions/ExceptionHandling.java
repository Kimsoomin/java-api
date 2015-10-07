package exceptions;
/**
 * @file_name : ExceptionHandling.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 7.
 * story      : Exception
 */
public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		int [] arr = {10,20,30};
		for (int i = 0; i <= arr.length; i++) {
			try {
				System.out.println(arr[i]+ "\t");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			System.out.println("프로그램 종료");
	}
}

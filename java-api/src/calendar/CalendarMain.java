package calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import grade.Grade;

/**
 * @file_name : CalendarMain.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 6.
 * story      : Calendar 클래스
 */
public class CalendarMain {
	/**
	 * 특정일 (2015-9-14) 로 부터 오늘까지 일수 구하기
	 * 2016-02-05 에서 오늘 날짜까지 남은 일수 구하기 (D-**) 
	 */
	public static void main(String[] args) {
		Grade g = new Grade();
		g.getHak();		// 인스턴스가 호출
		Scanner scanner = new Scanner(System.in);
//		Calendar startDay = Calendar.getInstance();
		Calendar today = Calendar.getInstance();	// 스태틱 메소드, rt.jar 에 getInstance() 위치값(주소)를 호출
		Daycount daycount = new Daycount();
		
//		int year=2015, month=9, date=14;		
//		startDay.set(year, month-1, date);	//실제값보다 월이 1작다
//		startDay.getTimeInMillis();		
		// 특정일에 해당하는 int값을 가져옴 (1970.01.01 부터 누적된 초단위)
//		int workDays = (int) Math.ceil((today.getTimeInMillis()- startDay.getTimeInMillis())/(24*60*60*1000));
//		System.out.println();
//		System.out.println(workDays+"일");

		System.out.println("특정일 입력");
		System.out.println(daycount.dc(scanner.next()));
	}
}
class Daycount {
	Calendar today = Calendar.getInstance();
	Calendar startDay = Calendar.getInstance();
	
	public String dc (String input) {

		StringTokenizer tok = new StringTokenizer(input,"-");
		int year = Integer.parseInt(tok.nextToken());
		int month = Integer.parseInt(tok.nextToken());
		int day = Integer.parseInt(tok.nextToken());
		System.out.println("=======================");
		
		startDay.set(year, month-1, day);
		int dday = (int) Math.ceil((startDay.getTimeInMillis()- today.getTimeInMillis())/(24*60*60*1000));					
		return "D-day: "+dday;
	}

}




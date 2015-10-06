package string;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @file_name : SimpleDateFormatMain.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 6.
 * story      :  SimpleDateFormat
 */
public class SimpleDateFormatMain {
	public static void main(String[] args) {
		Date today = new Date();	// CTRL + SHIFT + o

		SimpleDateFormat sdf1 = new SimpleDateFormat();								// 15.10.6 오후 3:59
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");					// 2015-10-06
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");		// 2015년 10월 06일 화요일
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");		// 2015-10-06 16:06:16
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");		// 2015-10-06 16:21:50 오후
		SimpleDateFormat sdf6 = new SimpleDateFormat();
		// SimpleDateFormat sdf1,sdf2,sdf3,sdf4,sdf5,sdf6;
		// str1 = new SimpleDateFormat();
		// str2 = new SimpleDateFormat();
		// str3 = new SimpleDateFormat();
		// str4 = new SimpleDateFormat();
		// str5 = new SimpleDateFormat();
		// str6 = new SimpleDateFormat();
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		

		
		
	}
}

package enums;

import java.util.Scanner;

public class EnumMain {
	/**
	 * 숫자값을 입력하면 숫자값에
	 */
	public static void main(String[] args) {
		
		System.out.println("가고자 하는 방향을 정하세요. 동:1, 서:2, 남:3, 북:4");
		Scanner scanner = new Scanner(System.in);
		Navigation n = new Navigation();
		n.setDirection(scanner.nextInt());
		System.out.println(n.getDirection());

		
	}

}

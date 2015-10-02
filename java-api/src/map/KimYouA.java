package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @file_name : KimYouA.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 2.
 * story      : HashMap 예제
 */
public class KimYouA {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("김연아", new Integer(98));
		map.put("아사다마오", new Integer(66));
		map.put("소트니 코바", new Integer(10));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();	// shallow copy
		while (it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.println("참가자:" +e.getKey() + ", 점수 : " +e.getValue());
		}
		set = map.keySet();
		System.out.println("참가자 명단:" +set); 	// 자료구조는 내부적으로 for 문과 toString() 내장되어 있다.
	
		Collection values = map.values();
		it = values.iterator();
		int total = 0;
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		
		System.out.println("대회총점 :" + total);
		System.out.println("대회평균 :" + total/set.size());
		System.out.println("대회 최고점 :" + Collections.max(values));
		System.out.println("대회 최저점 :" + Collections.min(values));
		
		
	}

}

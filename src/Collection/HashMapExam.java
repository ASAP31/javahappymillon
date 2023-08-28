package Collection;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		HashMap<String,Integer> map= new HashMap<>();
		
		
		map.put("윤서연", 10);
		map.put("정혜린",5);
		map.put("이지우",3);
		
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("윤서연"));
		map.remove("정혜린");
		map.remove("정혜린",5);
		
		System.out.println("총학생수"+map.size());
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		if(map.containsKey("이지우")) {
			int point = map.get("이지우");
		map.put("이지우", ++point);
		System.out.println("서장훈의 점수:"+map.get("이지우"));
		
		}
		else {
			map.put("이지우", 1);
			System.out.println("새로들어온이지우점수1");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

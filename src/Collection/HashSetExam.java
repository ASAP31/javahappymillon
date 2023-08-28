package Collection;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		HashSet<String> set =new HashSet<>();
		set.add("윤서연");
		set.add("정혜린");
		set.add("이지우");
		set.add("김채연");
		set.add("김유연");
		set.add("김수민");
		set.add("김나경");
		set.add("공유빈");
		
		System.out.println(set);
		System.out.println("학생 수"+set.size());
		for(String string : set) {
			System.out.println(string);
		}
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		if(set.contains("윤서연"))
			System.out.println("윤서연이 있습니다");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		System.out.println("삭제전: "+set.size());
		set.remove("김채연");
		System.out.println("삭제후: "+set.size());
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		set.clear();
		if(set.isEmpty())
			System.out.println("전체삭제후학생수 :"+set.size());
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		
		
		
		
		
		
		
		
		
		
	}

}

package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratirEaxm {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("윤서연");
		list.add("정혜린");
		list.add("이지우");
		list.add("김채연");
		list.add("김유연");
		list.add("김수민");
		list.add("김나경");
		list.add("공유빈");
		list.add("카에데");
		
		
		System.out.println(list);
		System.out.println("------------------------------------------------------------------");
		
		Iterator<String> it = list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println("------------------------------------------------------------------");
		
		
		

		it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("--------------------------------");
		System.out.println(list);
		it =list.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			if(s.contains("정혜린")) {
				it.remove();
			}
		}
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

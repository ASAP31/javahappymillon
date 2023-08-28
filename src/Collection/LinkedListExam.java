package Collection;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("김유연");
		list.add("코토네");
		list.add("윤서연");
		list.add("공유빈");
		list.add("박소현");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.addFirst("신위");
		list.addLast("정해린");
		list.add(1,"이지우");
		System.out.println(list);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
				
		
		

	}

}

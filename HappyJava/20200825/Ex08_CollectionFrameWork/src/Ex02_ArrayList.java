import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

// Today Point
public class Ex02_ArrayList {
	public static void main(String[] args) {
		// List 인터페이스 구현 .. 순서가정해짐 ,중복을허용 데이터집합
		ArrayList arraylist = new ArrayList();
		// Object 타입을 가지는 정적배열  hip메모리에 생성된다.
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		arraylist.add(400);
		
		int sum = 0; 
		for(int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
				System.out.println(arraylist.get(0));
		}
		System.out.println(arraylist.toString()); // 들어있는 데이터를 순차적으로 출력해준다.
		
		// add 순차적으로 데이터 넣기
		arraylist.add(0, 111); // 0번쨰 방에 111 을 넣으면 그값에 있던 값들은 뒤로 밀린다.
							   // 앞에 비워두면 한칸씩 앞으로 다 땡긴다.
							   // 중간에 데이터를 삭제하거나 삽입하는걸 굉장히 불안하게 생각한다. 
							   // 데이터를 뒤에 추가하고 뒤에서부터 삭제하는게 좋은방법이다.
		System.out.println(arraylist.toString());
		
		System.out.println(arraylist);
		arraylist.add(4, 444);
		System.out.println(arraylist);
		
		// 비순차적인 데이터 추가 , 삭제 >> ArrayList 적합하지 않는다. >> 순서가 있는 데이터의 집합
		// 순차적인 데이터 추가나 삭제를 ^^
		
		// arraylist.remove(200);// 애가 인덱스 번호로 생각해서 오류가 남 인덱스문제..
		//ArrayList가 가지고 있는 함수를 공부하기
		System.out.println(arraylist.contains(100)); // 파라미터에  배열에 값이 있으면 true 
		arraylist.clear(); // 데이터를 지우고 공간은 남아있다.
		System.out.println(arraylist.toString()); // [] 
		System.out.println(arraylist.size()); // 0 
		System.out.println(arraylist.isEmpty()); // 데이터가 비어있니 true
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		System.out.println(arraylist.isEmpty()); // 데이터가 있어서 false;
	
		System.out.println("삭제 전" + arraylist.size());
		Object value = arraylist.remove(0); // 0번쨰 방에 값을  지우는 데이터를 Object가 리턴받아줌
		System.out.println(value);// 삭제된 데이터를 내가 가질수있다.
		System.out.println("삭제 후" + arraylist.toString()); // 102 , 103 [ 중간에 빈공간을 지우고 치고올라간다 ]  
		System.out.println(arraylist.size()); // 2 
		
		arraylist.add(104);
		System.out.println(arraylist.toString());
		arraylist.remove(0);
		System.out.println(arraylist.toString());
		
		arraylist.add(105);
		System.out.println(arraylist.size()); // 3
		
		for(Object obj : arraylist) {
			System.out.println(obj); // 103 , 104 , 105
		}
		Vector vector2 = new Vector();
		//Point
		// 개발자 쓰는 코드 ...... 일상다반사 어떻게 쓰나 ?
		// 다형성.....
		List li = new ArrayList(); // ArrayList 부모가 List라서 주소값을 전달할수 있다. ( 다형성  )
		// 다향성을 쓰면 확장성이 좋고 유연성도 확보 , 습관적으로 굉장히 좋아한다.
		li.add("가"); // 모든 타입을 넣을수있다.
		li.add("나"); 
		li.add("다"); 
		li.add("라"); 
		li.add("가"); // list는  중복 허용 왜? 첨자로 구분할수있으니까
	
		List li2 = li.subList(0, 2); // sublist 만들어주는 데이터 순서가 있는 데이터 집합이다.
		System.out.println(li2.toString()); // 0번쨰부터 1번쨰까지 뺴오다
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		System.out.println(alist.toString());
		
		Collections.sort(alist); // 초급자는 절대 쓰면 안된다. >> 중급자 이상만 
		System.out.println(alist.toString()); // 낮은값...
											  // 높은값...
		// 높은값부터 정렬하려면  리버스하고나서 내림차순 오름차순 할수있다.
		Collections.reverse(alist); // reverse는 void라 채인이 안먹힌다.
		System.out.println(alist.toString());
		
		arraylist.add(0,200);
		
	}
}

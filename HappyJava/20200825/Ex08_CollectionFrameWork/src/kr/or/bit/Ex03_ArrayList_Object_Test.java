package kr.or.bit;

import java.util.ArrayList;

interface A {
	public abstract void method();
}

class B implements A {
	@Override
	public void method() {
		System.out.println("������");
	}
}


public class Ex03_ArrayList_Object_Test {	
	public static void main(String[] args) {
		Emp emp = new Emp(100,"������  ","����");
		System.out.println(emp.toString());
		
		// ��� 2�� (Array)
		Emp array[] = {new Emp(100,"�达  ","�Ϲ�  ") ,
				new Emp(300,"�ھ�  ","���") ,
			 new Emp(400,"�ڷ�  ","���")};	
		
		for(Emp e : array) {
		   System.out.println(e);
			}
		ArrayList elist = new ArrayList();
		elist.add(array);
		Object obj = null;
		Emp emp2 = (Emp)obj;
	
		
		ArrayList<A> array2 = new ArrayList<A>();
		
		array2.add(new B());
		elist.add(new Emp(2,"�ھ�","IT"));
		elist.add(new Emp(3,"�达","IT"));
			
		 Object obj3 = new Emp(3,"�о��","TI");
		 Emp emp3 = (Emp)obj3;	  
	for(int i = 0 ; i < elist.size(); i ++) {
			Object obj2 = elist.get(i);
				if(emp instanceof Object) {
					Emp emp1 = (Emp)obj2;
						System.out.println(emp1.getEname() + emp1.getEmpno() + emp1.toString());				
				}
		for(Object e : elist ) {			
			}
		}
	}
}


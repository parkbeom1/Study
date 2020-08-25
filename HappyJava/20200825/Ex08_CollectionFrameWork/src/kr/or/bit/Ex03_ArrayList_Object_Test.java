package kr.or.bit;

import java.util.ArrayList;

interface A {
	public abstract void method();
}

class B implements A {
	@Override
	public void method() {
		System.out.println("±¸Çö¿Õ");
	}
}


public class Ex03_ArrayList_Object_Test {	
	public static void main(String[] args) {
		Emp emp = new Emp(100,"±èÀ¯½Å  ","±ºÀÎ");
		System.out.println(emp.toString());
		
		// »ç¿ø 2¸í (Array)
		Emp array[] = {new Emp(100,"±è¾¾  ","ÀÏ¹Ý  ") ,
				new Emp(300,"¹Ú¾¾  ","»ç¿ø") ,
			 new Emp(400,"ÄÚ·Õ  ","»ç¿ø")};	
		
		for(Emp e : array) {
		   System.out.println(e);
			}
		ArrayList elist = new ArrayList();
		elist.add(array);
		Object obj = null;
		Emp emp2 = (Emp)obj;
	
		
		ArrayList<A> array2 = new ArrayList<A>();
		
		array2.add(new B());
		elist.add(new Emp(2,"¹Ú¾¾","IT"));
		elist.add(new Emp(3,"±è¾¾","IT"));
			
		 Object obj3 = new Emp(3,"¹Ð¾ç¹Ú","TI");
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


package kr.or.bit;

import java.util.ArrayList;

public class Ex03_ArrayList_Object_Test {	
	public static void main(String[] args) {
	  Emp emp = new Emp(100,"������","����");
	  System.out.println(emp.toString());
	  
	  // ���� �迭�� ��������
	  
	  Emp array[] = { new Emp(100,"�达","�Ϲ�"),new Emp(200,"ȫ��","���")};
	  for(Emp e : array) {
		  System.out.println(e.toString());
	  }

	  ArrayList list = new ArrayList();	  
	  list.add(new Emp(300,"�ھ�","���"));
	  System.out.println(list.size()); // 1
	  
	  for(int i= 0 ; i <list.size(); i++) {
		  System.out.println(list.get(i).toString()); 
	  	} 
	  
	  
	  for(int i = 0; i < list.size(); i++) {
		  Object obj = null;
		  	if(obj instanceof Emp) {  
			  obj = list.get(i);
		      	Emp emp2 = (Emp)obj;  
		      	
		      	System.out.println(emp2.getEname() + emp2.getEmpno() + emp2.getJob());
		  		}
	  		}
		}
	}

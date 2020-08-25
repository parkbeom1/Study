package kr.or.bit;

import java.util.ArrayList;

public class Ex03_ArrayList_Object {
	public static void main(String[] args) {
		// 사원 1명을 만드세요
		Emp emp = new Emp(100,"김유신","군인");
		System.out.println(emp.toString());
		
		// 사원2명 (Array)	
		Emp array[] = { new Emp(100,"김씨","일반"), new Emp(300,"박씨","학생")};
		for(Emp e : array) {
			System.out.println(e.toString());
		}
		//1명이 입사를 더했습니다. 추가하세요.
		// 정적배열은 크기가 한번 정해지면 추가하는게 불가능했다
		// 이제 ArrayList를 해서 이제 추가할수있다
		ArrayList elist = new ArrayList();
		// 1명 입사
		elist.add(new Emp(2,"김씨","IT")); // Object 타입은 모든타입이 올수있다.
		elist.add(new Emp(3,"박씨","IT"));
		System.out.println(elist.size()); // 2
		System.out.println(elist.get(0).toString()); // 0번쨰 주소값 출력
		
		for(int i = 0; i < elist.size(); i++) {
			System.out.println(elist.get(i));
		}
		// toString을 사용하지말고 사원의 사번 이름 직종을 출력하시오
		// 일반 for문으로.. getEmpno(),getEname(),getJob() 함수를 호출 하여 출력
		
		// 원타입으로 복귀시키려면 오브젝트가 가지고있는것밖에 못보니까
		// 오브젝트로 하면 내가 다시 내 타입으로 복권할떄
		// 보고싶은건 자식꺼니까 자식타입으로 다운캐스팅하고 나서 접근해야 한다.
		// 반복적으로 하니 매우 안좋은것 같아 
		for(int i = 0; i < elist.size(); i++) {
			Object obj = elist.get(i);
				if(emp instanceof Object) {
					Emp emp1=(Emp)obj;
		System.out.println(emp1.getEmpno() + emp1.getEname() + emp1.getJob());
				}		
				for(Object e : elist) {
					Emp em = (Emp)e;			
				}
				// 이런식으로 코드는 개발자...정말짜증 ....
				// 다시 다운 캐스팅 반복적....
				// Object 쓰지않고도 객체 
				// 나중에 제너릭으로 해결할수있다 
				// 제너릭 ( 객체 생성 타입 강제)
				// 제너릭 Emp타입만 넣을수있게 해뒀다 (배열의 타입만 가질수있게 하게함)
				// 저장공간의 타입을 하나로 세팅하겠다는 것이다. 
				ArrayList<Emp> list2 = new ArrayList<Emp>();
				list2.add(new Emp(1,"홍길동","짱짱"));
				// 이제 캐스팅에 대한 고민은 하지 않아도 된다.
				for(Emp e :list2 ) {
					System.out.println(e.getEname());
					// 다운캐스팅 하지 않아도 자식객체껄 부를수있게 됬다 
					}		
			list2.add(new Emp(2,"하하","일반사원"));
			list2.add(new Emp(3,"재석","일반사원"));
			list2.add(new Emp(4,"명수","일반사원"));
			list2.add(new Emp(5,"형돈","일반사원"));
			
			for( i = 0 ; i < list2.size(); i++) {
				System.out.println(list2.get(i).getEname());
				}		
			}
		}		
	}


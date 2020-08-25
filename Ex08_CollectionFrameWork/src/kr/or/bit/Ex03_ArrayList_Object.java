package kr.or.bit;

import java.util.ArrayList;

public class Ex03_ArrayList_Object {
	public static void main(String[] args) {
		// ��� 1���� ���弼��
		Emp emp = new Emp(100,"������","����");
		System.out.println(emp.toString());
		
		// ���2�� (Array)	
		Emp array[] = { new Emp(100,"�达","�Ϲ�"), new Emp(300,"�ھ�","�л�")};
		for(Emp e : array) {
			System.out.println(e.toString());
		}
		//1���� �Ի縦 ���߽��ϴ�. �߰��ϼ���.
		// �����迭�� ũ�Ⱑ �ѹ� �������� �߰��ϴ°� �Ұ����ߴ�
		// ���� ArrayList�� �ؼ� ���� �߰��Ҽ��ִ�
		ArrayList elist = new ArrayList();
		// 1�� �Ի�
		elist.add(new Emp(2,"�达","IT")); // Object Ÿ���� ���Ÿ���� �ü��ִ�.
		elist.add(new Emp(3,"�ھ�","IT"));
		System.out.println(elist.size()); // 2
		System.out.println(elist.get(0).toString()); // 0���� �ּҰ� ���
		
		for(int i = 0; i < elist.size(); i++) {
			System.out.println(elist.get(i));
		}
		// toString�� ����������� ����� ��� �̸� ������ ����Ͻÿ�
		// �Ϲ� for������.. getEmpno(),getEname(),getJob() �Լ��� ȣ�� �Ͽ� ���
		
		// ��Ÿ������ ���ͽ�Ű���� ������Ʈ�� �������ִ°͹ۿ� �����ϱ�
		// ������Ʈ�� �ϸ� ���� �ٽ� �� Ÿ������ �����ҋ�
		// ��������� �ڽĲ��ϱ� �ڽ�Ÿ������ �ٿ�ĳ�����ϰ� ���� �����ؾ� �Ѵ�.
		// �ݺ������� �ϴ� �ſ� �������� ���� 
		for(int i = 0; i < elist.size(); i++) {
			Object obj = elist.get(i);
				if(emp instanceof Object) {
					Emp emp1=(Emp)obj;
		System.out.println(emp1.getEmpno() + emp1.getEname() + emp1.getJob());
				}		
				for(Object e : elist) {
					Emp em = (Emp)e;			
				}
				// �̷������� �ڵ�� ������...����¥�� ....
				// �ٽ� �ٿ� ĳ���� �ݺ���....
				// Object �����ʰ� ��ü 
				// ���߿� ���ʸ����� �ذ��Ҽ��ִ� 
				// ���ʸ� ( ��ü ���� Ÿ�� ����)
				// ���ʸ� EmpŸ�Ը� �������ְ� �ص״� (�迭�� Ÿ�Ը� �������ְ� �ϰ���)
				// ��������� Ÿ���� �ϳ��� �����ϰڴٴ� ���̴�. 
				ArrayList<Emp> list2 = new ArrayList<Emp>();
				list2.add(new Emp(1,"ȫ�浿","¯¯"));
				// ���� ĳ���ÿ� ���� ����� ���� �ʾƵ� �ȴ�.
				for(Emp e :list2 ) {
					System.out.println(e.getEname());
					// �ٿ�ĳ���� ���� �ʾƵ� �ڽİ�ü�� �θ����ְ� ��� 
					}		
			list2.add(new Emp(2,"����","�Ϲݻ��"));
			list2.add(new Emp(3,"�缮","�Ϲݻ��"));
			list2.add(new Emp(4,"���","�Ϲݻ��"));
			list2.add(new Emp(5,"����","�Ϲݻ��"));
			
			for( i = 0 ; i < list2.size(); i++) {
				System.out.println(list2.get(i).getEname());
				}		
			}
		}		
	}


package StringClass;

import java.util.StringTokenizer;

public class Ex07_String_Function {
	public static void main(String[] args) {
		String str = "Hello";
		str.concat("�ȳ�");
		System.out.println(str.concat(" world"));
		boolean bo = str.contains("ello"); // �����ϸ� true 
		System.out.println(bo);
		
		String str2 = "a b c d";
		System.out.println(str2.length()); // 7 (���鵵 ����)
		String filename = "hello java world";
		System.out.println(filename.indexOf("h")); // h�� �ִ� �ε��� ��ȣ ����
		System.out.println(filename.indexOf("java")); // ���� ��ġ �� 6
		System.out.println(filename.indexOf("������")); // ã�°��� ������ -1
		// 0���� ū ���̸� 1���� ����...
		
		if(filename.indexOf("wo") != -1) { 
		// ����Ÿ�� �̸� ���ؾߵ� 0���� ū ���̸� ���� ������ �ִ�. -1 �� �ƴϸ� ���� ������ �ִ�
			System.out.println("wo�� ������ �ֽ��ϴ�.");	// true
		}
		System.out.println(filename.lastIndexOf("a")); // 9
		// length() , indexOf() , subString() , replace() , split()
		// �κ����� ���� ���� subString(int beginIndex,int endIndex) // endIndex ���� -1 �� �ڸ�����
		
		// subString �� ���۰� ���� ã���� �ִ�.
		String result = "supername";
		
		System.out.println(result.substring(0)); // 0������ �� ���
		System.out.println(result.substring(0,2)); // su
		System.out.println(result.substring(0,0)); // ��¾���
		System.out.println(result.substring(2,3)); // p 
		
		
		//Quiz 
		String filename2 = "aaaa.zip"; // �Ǵ� hong.png �Ǵ� h.jpeg��  �ü��ִµ�
		// ���⼭ ���ϸ�� Ȯ����� ����ϼ���
		
		System.out.println("���ϸ� : " + filename2.substring(0,filename2.lastIndexOf("."))); // subString(ó������ , ���������ִ� . ����)
		System.out.println("Ȯ��� : " + filename2.substring(filename2.indexOf(".")+1,filename2.length())); // subString(.�������� , ������ ���̱���)
		
		// ����� ���
		int position = filename2.indexOf(".");
		String file = filename2.substring(0,position);
		String extention = filename2.substring(position+1,filename2.length());
		String extention2 = filename2.substring(++position); // ������ �������� �������ְ� 
		
		System.out.println(file); // aaa
		System.out.println(extention); // zip
		System.out.println(extention2); // zip
 
	
		// replace (ġȯ�Լ�)
		String str3 = "ABCDDDDDA";
		String result3 = str3.replace("DDDDD", "������ �����");
		System.out.println(result3);
		
		//ETC
		System.out.println();
		// �ε����� �ָ� ���ڸ� ã�Ƴ���.
		System.out.println(str3.charAt(0)); // A
		System.out.println(str3.charAt(3)); // D
		// Ư�� ���ڿ��� �������� boolean ���� ��ȯ
		System.out.println(str3.endsWith("DA")); // true
		System.out.println(str3.endsWith("ABC")); // false
		
		System.out.println(str3.equalsIgnoreCase("abcddddda")); // true
		
		
		// > > Today Point < <
		// Split Ư�����ڿ� �������� �̾Ƴ���.
		// String str4 = "���۸� , ��Ƽ , ����� , ������";
		
		// �и��Ȱ� �迭�濡 �ִ´�. �迭�� ���� for���� ������.
		// String[] namearray = str4.split(",");
		
		// split - . �������� ����.
		
		String str4 = "���۸�,��Ƽ,�����,������";
		
		String[] str5 = str4.split(",");
	
		for(String s : str5) {
			System.out.print(s + " ");
		}
		
		/*
			����ǥ���� ǥ�� ( java,javascript , Oracle , c#) �������� ��Ģ ���
			��� ���ڸ� ���鶧 ��Ģ�� �ο� �ϴ°��̴�. >> ��ȿ�� �Ǵ��� �ٰŰ� �ȴ�.
			�ֹι�ȣ ���� 6�ڸ� , ��� Ư�����ڿ�  ���� 7�ڸ� {\d} - {\d} �� ��Ģ�� �°� �Է��� �ߴ���
			�ڵ��� 12345-1234567 >> false �� �޴´�
			������ȣ
			�����ȣ
			�������ּ�
			�̸����ּҵ��� ���� ���� ǥ�������� �����صд�.
			// https://regexper.com/#%5E%28%3F%3A%5B0-9%5D%7B2%7D%28%3F%3A0%5B1-9%5D%7C1%5B0-2%5D%29%28%3F%3A0%5B1-9%5D%7C%5B1%2C2%5D%5B0-9%5D%7C3%5B0%2C1%5D%29%29-%5B1-4%5D%5B0-9%5D%7B6%7D%24
		
			// ���� ���� ���� ǥ����  ���������� ���߿� ���� - > �ֹι�ȣ�� ������ �ؼ��� �ؾ��Ѵ�. ù���ڰ� �Ӱ� �;� �ϴ���
			split �������� ����ǥ������ �����ִµ�
			.�̶�� ����ǥ���� �����̶� �̽������� �״�� \. �� �ᵵ �̰͵� ����ǥ����
			\\. �� ����Ѵ�.
		*/
		System.out.println();
		String filename3 = "bit.hwp";
		// split ����ؼ� ���ϸ�� Ȯ��� ���
		// ���ϸ�
		String[] str6 = filename3.split("\\.");
		
		for(String s : str6) {
			System.out.println( s );  // ���ϸ�� Ȯ��� ��µ�
		}
		System.out.println("Ȯ��� ");
	
	// ��� ���� �������� �������� ���ڸ� �и��Ϸ��� ?
	String str10 = "a/b.c-d.f";
	StringTokenizer sto = new StringTokenizer(str10,"/-.");
	while(sto.hasMoreElements()) {
		System.out.print(sto.nextToken());
		System.out.println();
		
		}
	System.out.println();
	
	// �ͼ���
	String str7 = " ȫ �� �� ";
	// ���� >> �������� >> "ȫ�浿";
	StringTokenizer sto2 = new StringTokenizer(" ");
	while(sto2.hasMoreElements()) {
		System.out.print(sto2.nextToken());
		System.out.println();
		}
	System.out.println();
	String str8 = "    ȫ�浿       ";
	System.out.println(">" + str8 + "<");
	// �������� "ȫ�浿"
	System.out.println(str8.replaceAll(" ", ""));
	System.out.println(str8.trim());
	System.out.println(str8);
	// ...........�������� �Լ��� �����Ҷ���( method chain )�� ����Ѵ�. <- �߿� 
	System.out.println(str8.trim().replace(" ", "").substring(0));
	// �����ǰ� ����� String �̴ϱ�  chain ���� ����
	
	// Quiz - 1
	int sum = 0;
	String[] number = {"1","2","3","4","5"};
	//����
	 // �迭�� �ִ� ���ڰ����� ���� sum ������ ��Ƽ� ��� 
	// �� ���ڿ� �迭�� �������� ���� for���� ���� ��
		for(String s : number) {
			sum += Integer.parseInt(s); // ���ڿ� -> ������ ��ȯ ��  sum�� ���� ����
		}
		System.out.println(sum);
	
	// Quiz - 2
	int sum2 = 0;
	String jumin = "123456-1234567"; // �ֹι�ȣ �� ���ϱ�
	String[] number2 = jumin.replace("-", "").split(""); // ������� �������� 
	for(String s : number2) {
			sum2 += Integer.parseInt(s); // String�� ������ ������ ����ȯ 
 	}
	System.out.println(sum2); // 49
	}
}
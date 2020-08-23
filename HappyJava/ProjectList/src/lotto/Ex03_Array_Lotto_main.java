package lotto;
/*
 *1. 1~45������ ������ �߻����� 6���� �迭�� ��������
      (int)(Math.random()*45 + 1)
      lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
 *2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (�ߺ��� ���� :����� ���)
 *3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����  (���� : �ڸ��ٲ�)
 *4. �� ����� ��� �ִ� �迭�� ����ϼ��� (ȭ�� ���)
 ���Ŀ��� ������ Ŭ���� �и��ؼ� Lotto.java ..... 
 ���� main �Լ� �ȿ��� ��� ....����..
���� 1�� �Դϴ�
 */
public class Ex03_Array_Lotto_main {
	public static void main(String[] args) {
		int temp;
		//6�� �迭���� ���� 
		int[] lottoNum = new int[6]; 
		for(int i = 0 ; i < lottoNum.length; i++) {
			lottoNum[i] =(int)(Math.random()*45+1); // ��������
			for(int j = 0; j < i; j++) { // i = 1 j = 0 , i = 2  j = 0 , 1 , 
				if(lottoNum[i] == lottoNum[j]) { 
					i--;
						System.out.println("�ߺ��߻�");
					}
				}
			System.out.printf("lotto[%d] : %d \n", i , lottoNum[i]);
		}
		System.out.println();
		System.out.println();
		
		for(int i = 0; i <lottoNum.length; i++) {
			for(int j = 0; j < i; j ++) {
				if(lottoNum[j] > lottoNum[i]) {
						temp = lottoNum[i]; 		// �������� temp�� 
						lottoNum[i] = lottoNum[j]; // ū���� i��
						lottoNum[j] = temp; // �������� j�� 
											// ū �� i�� ���� ������ j�� ����. 
					i = 0;
				}
			}
		}
		for(int i = 0; i < lottoNum.length; i++) {
			System.out.printf("[%d��] �� �ζǹ�ȣ�� %d �Դϴ�",i+1,lottoNum[i]);
		}
	}
}

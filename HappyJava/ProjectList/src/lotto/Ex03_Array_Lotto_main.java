package lotto;
/*
 *1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
      (int)(Math.random()*45 + 1)
      lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
 *2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (중복값 검증 :별찍기 비슷)
 *3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요  (정렬 : 자리바꿈)
 *4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)
 추후에는 별도의 클래스 분리해서 Lotto.java ..... 
 현재 main 함수 안에서 사용 ....연습..
조별 1개 입니다
 */
public class Ex03_Array_Lotto_main {
	public static void main(String[] args) {
		int temp;
		//6개 배열공간 생성 
		int[] lottoNum = new int[6]; 
		for(int i = 0 ; i < lottoNum.length; i++) {
			lottoNum[i] =(int)(Math.random()*45+1); // 난수생성
			for(int j = 0; j < i; j++) { // i = 1 j = 0 , i = 2  j = 0 , 1 , 
				if(lottoNum[i] == lottoNum[j]) { 
					i--;
						System.out.println("중복발생");
					}
				}
			System.out.printf("lotto[%d] : %d \n", i , lottoNum[i]);
		}
		System.out.println();
		System.out.println();
		
		for(int i = 0; i <lottoNum.length; i++) {
			for(int j = 0; j < i; j ++) {
				if(lottoNum[j] > lottoNum[i]) {
						temp = lottoNum[i]; 		// 작은값을 temp에 
						lottoNum[i] = lottoNum[j]; // 큰값을 i로
						lottoNum[j] = temp; // 작은값을 j로 
											// 큰 게 i로 가고 작은게 j로 간다. 
					i = 0;
				}
			}
		}
		for(int i = 0; i < lottoNum.length; i++) {
			System.out.printf("[%d번] 의 로또번호는 %d 입니다",i+1,lottoNum[i]);
		}
	}
}

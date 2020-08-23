package instanceofTest;

public class ReturnTest {
	
	
	public static void main(String[] args) {
		
			int a = 10;   
	        abc(a); // a에 값에 그냥 10을 넘겨준거지 a는 k가 되지않는다.
	        System.out.println(abc(a));     
	        
		}	    
	    static int abc(int k) { // 20
	    k += 5;    
	    return k;
	    // 함수 안쪽에서 변환시킨 값을 함수 바깥으로 넘겨주는 방법이 필요
	}
}

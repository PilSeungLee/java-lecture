

//반복문은 컴퓨터가 프로그램을 읽는 방식에서 역행(위로 다시 돌아가서 읽게 하는) 하는 유일한 도구

// for
// while
// do while


public class LoopExample {

	public static void main(String[] args) {
		
		// for (할당식 혹은 초기화 ; 조건비교식 ; 증감연산) {
		//  -- 여기가 반복 실행
		// }
		
		int i;
	    for (i = 2 ; i<10; i++) {
	    	System.out.println(i);
		}

	    System.out.println("최종 i값은" + i + "입니다.");
	    
	}

}

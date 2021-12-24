
//조건문 IF


public class ifExmple {

	public static void main(String[] args) {
		
		
		// 1. if문의 구조는
		// if (조건비교문) {참일때 실행}
		// if (조건비교문) {참일때 실행} else {거짓일때 실행}
		// if (조건비교문) {참} else if(조건비교문) {참} else {거짓}
		// if () {} else if() {}
		// if else 는 if 뒤에 조건이 참이 나오면 뒤의 조건은 실행되지 않음
		
		
		
		
		int a = 10, b = 15;
		if( a == 10 || b > 15) {
			System.out.println("참입니다.");
		
		} else {
			System.out.println("거짓입니다.");
		
		
		int c = 11;
		if(c % 2 == 0) {
			
		} else if ( c % 3 == 0) {
			
		} else if ( c % 4 == 0) {
			
		} else if ( c % 1 == 0) {
			
			
		} else {
			System.out.println("c는 나눠지는 수가 없음");
		}
		

		}
	}
}

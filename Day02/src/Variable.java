// 변수 : 데이터를 담는 그릇,라벨링 같은..

// 변수 명명 규칙은 단봉낙타




public class Variable {

	public static void main(String[] args) {
	
		//자료형 변수명 = 데이터;
		int a = 10;
		int x;
		int myAge = 19;
		
		System.out.println(a);
		System.out.println(a + a);
		System.out.println(a * a);
	
		x = 9;
		x = a - x;
		
		// 변수의 문법적 특징 int는 숫자형 변수
		
		// 1. 변수의 시작은 숫자일 수 없음
		//int 0name; // 에러
		//int name0; // 정상
		
		// 2. 변수의 이름은 예약어(자바에서 사용하고 잇는 언어) 일 수 없음
		//int class; //자바 컴파일러가 사용하고 있는 예약어인 class는 사용 불가
		
		// 3. 공백 허용
		//int iAmSam; 정상
		//int i am sam // 공백허용하지 않음 에러
		
		// 4. 같은 scope 블록{---} 에 같은 이름의 변수는 허용되지 않음
		//int im = 10;
		//int im;
		
		// 5. 대소문자 구분함
		// int imABoy = 10;
		// int imaboy = 9;
	
		
		

	}

}

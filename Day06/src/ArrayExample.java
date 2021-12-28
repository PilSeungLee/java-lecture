

// 배열 : 값의 집합, 배열의 시작은 0
// 변수 선언법 : 데이터타입 변수명[갯수] or 데이터타입[갯수] 변수명

// int a[10];

public class ArrayExample {

	public static void main(String[] args) {
        
		// 1. 선언방식
	    int[] a = new int[10];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		
		
		// 반복문으로 값 넣기
		for(int i = 0; i<5; i++) {
			a[i] = 1;
			
		}
		
		
		// 배열 선언 + 출력
		int[] b = {1,2,3,4,5};
		
		for (int i=0; i<b.length; i++) {
			System.out.println(i+1);
			
		}
		

		// 배열 정리
		// 1. 배열은 같은 데이터타입을 가지는 연속적인 방
		// int[5] -> 4 * 5 = 20 bytes
		
		// 배열 선언법
		// int[] 변수명;
		
		// 배열 선언과 동시에 방 만들기
		// char[] 변수명 = new char[5];
		// 값넣기 : a[0] = 97, a[1] = 98....;
		// 값넣기 : for 문 같은 반복문 사용
		char[] alpha = new char[24];
		
		for (int i = 0; i< alpha.length; i++) {
			System.out.print(alpha[i]);
			
		}
		
		
		// 배열 선언과 동시에 값 집어넣기
		// 데이터타입 배열변수명 = {값};
		// char arrCh = {97, 98, 99};
		
		
		
		
		
		
		
	}

}


public class TypeCastingExample {

	public static void main(String[] args) {
		
		//정수형 데이터 타입
		//명시적 형 변환
		int a = 10; //4bytes
		short b = (short)a; //2bytes
		
		
		//묵시적 형 변환
		short c = 100; //2bytes
		int d = c; //4bytes
		
		//byte x = 128; //1byte : -128 ~ 127까지 범위, 범위 벗어남
		
		
		//예제
		int a1 = 128;
		byte x1 = (byte)a1;
		System.out.println(x1); //쓰레기 값이 들어감 (-128), 에러

	}

}

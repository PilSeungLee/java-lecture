
public class MathExample {

	public static void main(String[] args) {

		// 산술연산 
		// + - * / %
		
		
		int a = 10;
		int b = 20;
		
		
		//토털 사용 바이트는 4+4 8바이트 사용(효율적임)
		System.out.println(a+b+a);  //덧셈
		// 토털 사용 바이트는 4*3 12바이트
		//System.out.println(10+20+10);
		
		
		
		System.out.println(a - b); //뺄셈 = -10
		
		
		System.out.println(a * b); //곱셈 = 200
		
		
		System.out.println("a / b = " + (a/b)); //나눗셈 = 0, 실제로는 0.5지만 기본정수형은 int 이기 때문에 0을 출력
		
		
		int c = 15;
		
		System.out.println("c%a=" + (c%a));
		System.out.println("c%b=" + (c&b));

	}

}

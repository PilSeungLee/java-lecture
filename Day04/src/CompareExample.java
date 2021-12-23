
public class CompareExample {

	public static void main(String[] args) {
		
		
		//비교연산 : 참/거짓을 밝히는 연산
		
		// >, <, >=, <=
		// == 같다 (=할당)
		// != 같지 않다 (!=not)
		// 결과값은 boolean
		
		
		int a = 10;
		int b = 20;
		
		System.out.println("a>b=" +(a>b));
		System.out.println("a<b=" +(a<b));

		
		boolean result = (a>=b);
		System.out.println(result);

		System.out.println("!(a>b)" + !(a>b));
		// ! 는 not 을 의미, !false==true, !true==false
		
		
		System.out.println("a==b" + (a==b));
		// a==b -> a와 b가 값은 값
		
		
		System.out.println("a!=b"+(a!=b));
		
		
		
		
	}

}

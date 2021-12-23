
public class LogicalExample {

	
	//논리연산
	
	
	public static void main(String[] args) {
		
		// AND, OR, XOR, NOT
		
		
		//1.AND 연산
		// &, && -> true & true, true && true
		// 양쪽 모두 참 이어야 결과값이 참
		
		int a = 10, b = 15;
		boolean result = (a!=b) && (a < b); // 값은 true
		System.out.println(result && false); // 값은 false
		
		
		int c = 10, d = 10;
		System.out.println((c++ == d++) && (c > d));
		System.out.println((c > d && (c++ == ++d)));
		System.out.println("c=" + c + "," + "d = " + d);
		//10, 10
		// && 은 false && true 의 수식이 있을때 false를 먼저 만나 뒤의 수식을 볼 필요 없으므로 패스
		
		//& 는 다 봄 false & true
		
		
		//2. OR 연산
		// |,||
		// 둘중 하나가 true 면 무조건 true
		
		int x = 100, y = 200;
		
		System.out.println(x != y || (x++ == y++));
		System.out.println("x = " + x + "," + "y = " + y);
		
		
		
		// 3. XOR 연산
		//^
		//양쪽이 달라야 true, 양쪽이 같으면 false
		//true ^ true = false
		//true ^ false = true
		
		
		//4. NOT
		// !true == false
		// !false == true
		
		
		
		
		
		
		
		
		

	}

}

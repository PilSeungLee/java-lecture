
public class ScopeExample {
	
	static String name = "이종석";
	
	public static void main(String[] args) {
		
		String name = "박은진";
		System.out.println(name);
					
		//선언된 변수는 중괄호 기준으로 범위가 정해진다
		// 사용할 변수명이 없으면 자기 상위 영역 중괄호를 체크한다

	}

}

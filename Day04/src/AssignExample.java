
public class AssignExample {

	public static void main(String[] args) {
		
		// 할당연산은 우에서 좌로
		// 좌측은 변수 혹은 상수, 우측은 데이터 혹은 값
		// '=' 할당연산자 라고 함
		
		int age = 44;   // 변수 선언과 동시에 44라는 값을 '할당'
		int age2 = 10;
		int age3 = age + age2 + 10 * 20;
		
		System.out.println("age :" + age);
		age = age + 10;
		
		
		// 변수 선언 후 할당
		int age4; // 변수를 선언하고
		age4 = age * 10 /20;
		System.out.println(age4);
		

	}

}





// Application 실행 스타팅 포인트
public class Application {

	public static void main(String[] args) {
		person p = new person(); // 내 눈앞에 보이는 것(가시화) 메모리에 올라와있음
		p.name = "이종석";
		p.sayHello();
		
		person p2 = new person();
		p.name = "하악하악";
		p.sayHello();
		
		// 주소값 비교로 같을 수 없음
		if(p==p2) {
			System.out.println("p와 p2는 같아요.");
		} else {
			System.out.println("p와 p2는 같이 않아요.");
		}
		
		// 객체 자체를 비교하는 것(같은 클래스 출신이냐?) = instanceof 연산자 활용
		
		if( p instanceof person) {
			//실행내용
		}
  
		if( p2 instanceof person) {
			//실행내용
		}
	}

}




// class 문법
// [접근 한정자] class 클래스명{내용}

class person {
	
	String name; //name 은 속성 

	public void sayHello() {
		System.out.println(name + "안녕하세요.");
				
	}
	
}


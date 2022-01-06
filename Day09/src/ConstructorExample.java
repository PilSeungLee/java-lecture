
public class ConstructorExample {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.printMynumber();
		Bus bus2 = new Bus(1000);
		bus2.printMynumber();
	}
	

}

//생성자를 선언하는 방법
//클래스명 (매개변수) {...내용...}
//this(키워드)
class Bus {
	int num = 503; //속성/멤버/필드
	
	
	//생성자 선언
	Bus() {
		num = 200;
	}
	
	Bus(int num) {
		this.num = num;
	}
	
	void printMynumber() {
		System.out.println(num);
	}
	
}

//탈것 클래스
class Vehicle {
	int wheelCnt;
	
	Vehicle(int wheelCnt){
		this.wheelCnt = wheelCnt;
	}
	
}




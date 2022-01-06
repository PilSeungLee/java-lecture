
public class StaticExample2 {

	public static void main(String[] args) {
		System.out.println("TestStatic");
		TestStatic ts = new TestStatic();
		System.out.println("TestStatic2");
		TestStatic ts2 = new TestStatic();

	}

}


class TestStatic {
	
	TestStatic() {
		System.out.println("TestStatic 객체 생성");
		
	}
	{
		System.out.println("TestStatic 초기화 블록 실행");
	}
	
	static {
		System.out.println("TestStatic / static 초기화 블록 실행");
	}
	
}


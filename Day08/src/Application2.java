
public class Application2 {

	public static void main(String[] args) {

		 //Korean k = new Korean();
		 //k.name = "나는 한국인";
		 //k.sayHello();

		person p = new Japanese();
		p.name = "나까무라";
		p.sayHello();
		
	}

}


//class 문법
//[접근 한정자] class 클래스명{내용}

class person1 {
	
	String name; //name 은 속성 

	public void sayHello() {
		System.out.println(name + " 안녕하세요.");
				
	}
	
}

//상속은 extends [Class명]
class Korean extends person {
	public void sayHello() {
		System.out.println(name + " 안녕하세요");
	}
	
}

class Japanese extends person {
	public void sayHello() {
		System.out.println(name + " 고니찌와");	
	
}

class Chinese extends person {
	public void sayHello() {
		System.out.println(name + " 니하오");	
	}
}
}



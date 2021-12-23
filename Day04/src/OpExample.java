
public class OpExample {

	public static void main(String[] args) {
		
		//단항연산자 (증감연산)
		
		
		//1. ++
		int a = 10;
		a ++; // a = a+1;
		System.out.println("a++ = " +a);
		++ a; //a = a+1;
		System.out.println("++a="+a); //12
		
		System.out.println(a++); //10 전위연산, 연산을 안하고 다음행에서 함
		System.out.println(++a); //11 후위연산, 연산을 하고 다음행으로 넘어감
	
		
		
		
		//2. --
		int d = 10;
		System.out.println(d--); //10
		System.out.println(d);   //9
		
		int e = 10;
		System.out.println(--e); //9
		System.out.println(e);   //9
		
		
		
		
	}

}

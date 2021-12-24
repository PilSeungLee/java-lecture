

//

public class MonthDetectExample {

	public static void main(String[] args) {
		
		
	   String input = args[0];
	   int command = Integer.parseInt(input);
	   
	   System.out.println("입력값은" + command + "입니다");
	   
	   
	   // input 이라는 인자를 받아서
	   // 1~12월 중 인자를 대체하는 영어 단어를 출력해라
	   // 12 -> 12월은 DEc. 입니다
	   // Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
	   
	   
	   
	   int month = 12;
		
		switch(month) {
		case 1 :
			System.out.println("Jan");
			break;
		case 2 :
			System.out.println("Feb");
			break;
		case 3 :
			System.out.println("Mar");
			break;
		case 4 :
			System.out.println("Apr");
			break;
		case 5 :
			System.out.println("May");
			break;
		case 6 :
			System.out.println("Jun");
			break;	
		case 7 :
			System.out.println("Jul");
			break;	
		case 8 :
			System.out.println("Aug");
			break;
		case 9 :
			System.out.println("Sep");
			break;
		case 10 :
			System.out.println("Oct");
			break;
		case 11 :
			System.out.println("Nov");
			break;
		case 12 :
			System.out.println(month + "월은" + "Dec" + "입니다.");
			break;	
		default : 
			System.out.println("");
			break;
	   
		
		
		}		

	}

}

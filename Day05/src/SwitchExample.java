

//switch 조건문


public class SwitchExample {

	public static void main(String[] args) {
		
		// switch(변수)
		// {
		// case : 비교값 :
		// break;
		// case : 비교값 :
		// break;
		// default :
		
		// }
		
		
		int month = 12;
		String month_name = "";
		switch(month) {
		case 10 :
			month_name = "OCT";
			break;
		case 11 :
			month_name = "NOV";
			break;
		case 12 :
			month_name = "DEC";
			break;
		default : 
			month_name = "없음";
			break;
			
		}
		
		
		System.out.println(month + "월은 영어로" + month_name + "입니다.");
		
		
	}

}

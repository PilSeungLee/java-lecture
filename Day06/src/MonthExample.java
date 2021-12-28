
public class MonthExample {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("ÀÚ¹Ù");
			
		} else {
		
		System.out.println(args.length);
		
		String[] arrMonthName = {
				
			"Jan",
			"Feb",
			"Mar",
			"Apr",
			"May",
			"Jun",
			"Jul",
			"Aug",
			"Sep",
			"Oct",
			"Nov",
			"Dec"
				
		};

		int command = Integer.parseInt(args[0]) -1;
		System.out.println(arrMonthName[command]);
		
		
	}

	}
	
	
	
}

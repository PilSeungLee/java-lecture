import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class NaverPriceApp {

	public static void main(String[] args) throws Exception {
		//java NaverPriceApp 맥북프로 2000000 3000000
		
		// 사용자가 규칙을 어기고 맥북프로 2000000 삼백만원 이라는 값을 넣었을때, maxPrice는 Integer로 변환이 불가
		// 따라서 Exception을 발생 
		String goodsName = args[0];
		int minPrice = Integer.parseInt(args[1]);
		int maxPrice = Integer.parseInt(args[2]);
		
		//1.개발자가 예외처리하는 방식
		// 아래처럼 하나하나 작업하고 그 외에 예외처리는 Exception 으로 처리
		// try{} catch() {} finaly {}
		//String goodsName = "";
		//int minPrice = 0, maxPrice = 0;
		
		//try {
		//goodsName = args[0];
		//minPrice = Integer.parseInt(args[1]);
		//maxPrice = Integer.parseInt(args[1]);
		//} catch(NumberFormatException ne) {
			
			//System.out.println("사용법 > java NaverPriceApp 상품명 최소가격 최대가격");
			//System.out.println("ex > java NaverPriceApp 아이패드 10000 20000");
			//return;
		//}
		
		
		
		String URL = "https://search.shopping.naver.com/search/all?maxPrice=%d&minPrice=%d&productSet=total&query=%s&sort=price_asc";
		URL = String.format(URL,  maxPrice, minPrice, goodsName);
		
		
		System.out.println(URL);
		
		
		
		//String.format(URL, args) //String 클래스의 static 매서드
		
		//'이종석'의 '집'은 '독산동'입니다
		/*String name = "이종석";
		String home = "집";
		String dong = "독산동";
		
		System.out.println(name + "의" + home + "은" + dong + "입니다");
		
		String format = "%s의 %s은 %s 입니다."; //%s는 문자열, %d는 숫자
		format = String.format(format, name, home, dong);
		System.out.println(format);*/
		
		//1. java.net 패키지 사용하기
		//String html = getHtml(URL);
		//System.out.println(html);
		
		//getHtmlByJsoup(URL);

	}
	
	//JSoup으로 HTML Parse
	private static void getHtmlByJsoup(String purl) throws Exception {
		
		Connection conn = Jsoup.connect(purl);
		Document html = conn.get();
		//System.out.println(html.toString());
		
		Elements files = html.select(".list_basis");
		System.out.println(files.size());
		
		for(int i = 0; i< files.size(); i ++) {
			System.out.println(files.get(i).text());
		
		}
		
	}
	

	//URL 을 가지고, 접속, HTML 파일을 가지고 온다
	private static String getHtml(String purl) throws Exception {
		
		String result = "";
		HttpURLConnection conn;  //웹 연결 클래스
		BufferedReader rd;       //라인단위 인풋 클래스
		String line;             //라인단위로 읽을 String을 임시 저장   
		
		URL url = new URL(purl);
		conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");		
		
		rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		while((line = rd.readLine()) !=null) {
			result += line + "\n";
		}
		
		rd.close();
		
		return result;
		
	}
	
	
}

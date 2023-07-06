package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜 : 2023/07/06
 * 이름 : 박경진
 * 내용 : HTTP 통신 실습
 */

public class HttpTest {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;	//파일에 기록을 하기위한 스트림
		BufferedReader br = null;		//버퍼를 장착한 reader 스트림
		
		try {
			URL url = new URL("http://google.com");	//Java 패키지의 URL
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./Result.txt");
			
			String line = null;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				fos.write(line.getBytes());
			}
			
			br.close();
			fos.close();
			
		} catch (MalformedURLException e) {	//MalformedURLException > 잘못된 주소 예외
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
}

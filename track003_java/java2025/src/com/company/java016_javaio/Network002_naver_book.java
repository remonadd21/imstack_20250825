package com.company.java016_javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Network002_naver_book {

	public static void main(String[] args) {
		//#1. URL
		try {
			String apiurl="https://openapi.naver.com/v1/search/book.json?query="
					+URLEncoder.encode("데스노트","UTF-8");
			URL url = new URL(apiurl);
			
			//#2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			//#3. 요청설정 GET
			// X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
			// X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id","W26IC7PsTk47Q6M_SpMl");
			conn.setRequestProperty("X-Naver-Client-Secret","t1Zs9mqbeH");
		
			//#4. 응답확인
			BufferedReader br;
			if(conn.getResponseCode()==200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			}else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			//#5. 응답데이터
			String line="";
			StringBuffer sb = new StringBuffer();
			while( (line = br.readLine()) !=null ) { sb.append(line+"\n"); }
			
			System.out.println(sb.toString());
			br.close();
			conn.disconnect();
			
		} catch (MalformedURLException e) { e.printStackTrace();
		} catch (UnsupportedEncodingException e) { e.printStackTrace(); 
		} catch (IOException e) {  e.printStackTrace(); } 
		

	}

}

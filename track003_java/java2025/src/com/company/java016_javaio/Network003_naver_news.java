package com.company.java016_javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Network003_naver_news {

	public static void main(String[] args) {
		//#1. URL
		try {
			String newsurl = "https://openapi.naver.com/v1/search/news.json?query="
					+URLEncoder.encode("캄보디아","UTF-8");
			URL url = new URL(newsurl);
			//#2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			//#3. 요청설정 GET
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
		} catch (UnsupportedEncodingException e) { e.printStackTrace(); 
		} catch (MalformedURLException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace();
		}


	}

}

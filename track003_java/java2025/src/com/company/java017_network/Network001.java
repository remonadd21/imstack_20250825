package com.company.java017_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network001 {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("1. IP HostTName : "+local.getHostName());
			System.out.println("2. Ip HostAddress : "+local.getHostAddress());
			
			local = InetAddress.getByName("www.naver.com");
			System.out.println("3. naver : "+local);
		} catch (UnknownHostException e) { e.printStackTrace(); }
	}

}
/****
1. Network
- 통신기숭들이 그물망처럼 연결된 통신을 이용하여 컴퓨터 자원을 공유

2. client vs Server
- Client (서비스사용)
- Server (서비스제공)

3. IP 주소 (컴퓨터 주소)
	192.168.0.1(건물)
	포트(건물 안의 문)
	80(HTTP 웹), 443(HTTPS 웹자물쇠), 22(SSH 보안 원켝호스트), 25(SMTP메일)

4. InetAddress - ip주소를 다루기위한 클래스

*/
package com.company.java016_javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class JavaIo004_img {

	public static void main(String[] args) throws IOException {
		// #1. 경로
		String origin="src/com/company/java016_javaio/sally.jpg";
		String target1="src/com/company/java016_javaio/sally1.jpg";
		String target2="src/com/company/java016_javaio/sally2.jpg";
		
		// #2. byte 이미지 파일 원본 읽어들여서 쓰기
		// sally.jpg -> sally1.jpg
		// InputStream > [프로그램] > OutputStream
		InputStream bis = new FileInputStream(origin);	// 원본 파일 읽어들여서
		OutputStream bos = new FileOutputStream(target1);// sally1.jpg 쓰기	
		
		int cnt1 = 0; 
		while( (cnt1 = bis.read()) !=-1 ) {
			 bos.write( (byte)cnt1 );
		}
		bos.flush();
		bos.close();
		bis.close();
		System.out.println(">> byte 이미지 복사완료! ");
		
		// #3. chat 이미지 파일 원본 읽어들여서 쓰기
		// sally.jpg -> sally2.jpg
		// Reader > [프로그램] > Writer
		Reader cr = new FileReader(origin); // 원본 읽어들여서
		Writer cw = new FileWriter(target2); // sally2.jpg로 쓰기
		
		int cnt2=0;
		while( (cnt2=cr.read()) !=-1) {
			// char 단위로는 이미지 복사가 어려움
			// 대부분 byte 단위로 복사함
			cw.write((char)cnt2); // sally2.jpg 쓰기
		}
		cw.flush();
		cw.close();
		cr.close();
		System.out.println(">> char 이미지 복사완료! ");
		

	}

}

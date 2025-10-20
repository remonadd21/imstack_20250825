package com.company.java016_javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaIo002_byte {

	public static void main(String[] args) {
	      String folder_rel="src/com/company/java016_javaio_ex/";  //상대경로(현재작업 폴더기준)
	      String file_path="io002.txt";
	      
	      File folder = new File(folder_rel);
	      File file = new File(folder_rel+file_path);
	      
	      // 폴더 + 파일 만들기 (exists, mkdir, createNewFile)
	      try {
		      if(!folder.exists()) {folder.mkdir();}
		      if(!file.exists()) {file.createNewFile();}
	      }catch(Exception e) {e.printStackTrace();}
	      
	      // byte 파일쓰기 InputStream > 프로그램 > OutputStream #
	      try {
			OutputStream output =new FileOutputStream(file);
			output.write('j');
			output.write('a');
			output.write('v');
			output.write('a');
			output.close();
			System.out.println("OutputStream 쓰기 완료!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {e.printStackTrace();}
	      
	     // byte 파일읽기 InputStream > 프로그램 > OutputStream
	     try {
			InputStream input = new FileInputStream(file);
			int cnt =0;
			while( (cnt = input.read()) !=-1) {
				// 숫자로 106이 나오기 때문에 문자로 보이게 하기 위해
				// 타입캐스팅 해주기
				System.out.print((char) cnt);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	      
	  
	
	}

}
/*
1. java Io
- 입력(input)과 출력(output) 
- 두 대상간의 데이터를 주고 받는것
- 스트림이란? 사용연결통로

 	입력스트림 	->  프로그램  -> 출력스트림
 			InputStream		OutpuStream
 			Rearder			Writer
 2. JavaIo 분류
 
 - byte / char
 - byte 단위(Inputstream / OuputStream) - 모든 종류(그림, 멀티미디어, 문자)
 - char 단위 (Reader / Writer) - 문자


3. 보조 스트림
----------------------------------------------------------------------------
- new BufferedReader (new InputStreamReader(new FileInputStream(file)))
----------------------------------------------------------------------------

- new FileInputStream(네트워크나, 사용자가 넣어준 값)  byte[#]/char
- new InputstreamReader 바이트를 [문자] 스트림으로 - 텍스트 처리가능
- new BufferedReader 속도향상

*/
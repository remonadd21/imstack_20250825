package com.company.java016_javaio;

import java.io.File;

public class JavaIo001 {

	public static void main(String[] args) {
			// 1. 경로체크
			String folder_abs ="C:\\file\\";	// 절대경로 (시스템의 폴더 기준)
			String folder_rel ="src/com/company/java016_javaio_ex/";	// 상대경로 (현재작업 폴더 기준)
			String file_path ="io001.txt";
			
			// 2. 폴더 + 파일 준비
			File folder = new File(folder_rel);
			File file = new File(folder_rel+file_path);
			
			// 폴더가 없다면,		폴더 만들기
			try {
				if(!folder.exists()) {folder.mkdirs();}
				if(!file.exists()) {file.createNewFile();}
			}catch(Exception e) {e.printStackTrace();}
			System.out.println("폴더/파일 준비완료");
			
	}// ctrl+f11 / f5(새로고침)

}

package com.company.dbmanager;
import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
public class DBManager {
	private static Connection  conn ;
	public DBManager() {  conn = null; }
	public static Connection getConn() { return conn; }
	public Connection getConnection()  throws  Exception{
		/*
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");        
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "o1", "1111"); 
			if(conn  != null) {  System.out.println("DB연동성공");}
		}catch(Exception e) { e.printStackTrace(); }
		//finally {}
		 */
		//1. server.xml   Context 설정한 리소스찾기
		Context  initContext = new InitialContext();
		//2. 환경설정
		Context  envContext =  (Context) initContext.lookup("java:/comp/env");   
		//3. datasource설정
		DataSource  db = (DataSource)envContext.lookup("jdbc/dbdbig");
		//4. connection 얻어오기
		Connection  conn  = db.getConnection();
		return conn;
	}
	
}

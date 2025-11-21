package com.bera.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import com.bera.dto.BJoinDto;

public class BJoinDao {

	//////////////////////////// join
	public int join(BJoinDto dto) {
		int result = -1;
		String sql =
			" insert into bruser (idNum, userId, userName, email, passw, gender, chk) values (idNum_seq2.nextval,?,?,?,?,?,?)";
		
		Connection conn = null; PreparedStatement pstmt= null; ResultSet rset = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott", pass="tiger";
		
		// 드커프리
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user,pass);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getUserId());
			pstmt.setString(2, dto.getUserName());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getPassw());
			pstmt.setString(5, dto.getGender());
			pstmt.setString(6, dto.getChk());
			
			if(pstmt.executeUpdate()>0) {result=1;}
			
		}catch(Exception e) {e.printStackTrace();		
		}finally {
		  if(rset != null) { try{rset.close();}catch(SQLException e){e.printStackTrace();}}
		  if(pstmt != null) { try{pstmt.close();}catch(SQLException e){e.printStackTrace();}}
		  if(conn != null) { try{conn.close();}catch(SQLException e){e.printStackTrace();}}

		}
		return result;
	}///////////////////////////// join end 
	
	//////////////////////////// login
	public int login(BJoinDto dto) {
		int result=-1;
		String sql = "select count(*) cnt from bruser where email=? and passw=?";
		
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott" , pass="tiger";
		
		// 드커프리
		try {
			//////////////////////////////////////////
			// 1. 드라이버이동
			Class.forName(driver);
			// 2. 커넥션
			conn = DriverManager.getConnection(url,user,pass);
			// 3. pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dto.getEmail());
			pstmt.setString(2,dto.getPassw());
			
			System.out.println(".................1 > "+dto);
			rset = pstmt.executeQuery();
            
			if (rset.next()) { result =  rset.getInt("cnt") ; }
			
            System.out.println("...................2 > "+result);
			///////////////////////////////////////////////
		}catch(Exception e) {e.printStackTrace();
		} finally {
			if( rset  != null ) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if( pstmt != null ) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if( conn  != null ) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
		return result;
		
	}
	// select * from bruser where email='1@1'
	
	public BJoinDto mypage(String email) {
		BJoinDto result = new BJoinDto();
		
		String sql = "select * from bruser where email=?";
		
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott" , pass="tiger";
		
		// 드커프리
		try {
			//////////////////////////////////////////
			// 1. 드라이버이동
			Class.forName(driver);
			// 2. 커넥션
			conn = DriverManager.getConnection(url,user,pass);
			// 3. pstmt
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,email);
		
			
			System.out.println(".................1 > "+email);
			rset = pstmt.executeQuery();
            
			if (rset.next()) { result =  new BJoinDto(    
					rset.getInt("idNum"),
			        rset.getString("userId"),
			        rset.getString("userName"),
			        rset.getString("email"),
			        rset.getString("passw"),
			        rset.getTimestamp("birth").toLocalDateTime(),
			        rset.getString("gender"),
			        rset.getTimestamp("joindate").toLocalDateTime(),
			        rset.getString("chk") ) ; }
			
            System.out.println("...................2 > "+result);
			///////////////////////////////////////////////
		}catch(Exception e) {e.printStackTrace();
		} finally {
			if( rset  != null ) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if( pstmt != null ) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if( conn  != null ) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
		
		return result;
		
	}
	
	
}

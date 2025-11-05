package com.bera.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.bera.dto.BeraDto;

public class BeraDao {
	
	/////////////////=> insert
	public int insert(BeraDto dto) {
		
		int result=-1;
		String sql = 
				 " insert into  brboard (idNum,USERID,USERNAME, USERPASS,TITLE,CONTENT,USERICENAME) values (idNum_seq2.nextval,?,?,?,?,?,?)";
		
		//오라클에서 date를 기본값으로 잡았다면 가져올 필요없음
		// view count도 나중에 클릭했을때 올릴 값
		// default값을 오라클에서 작성했다면 가져올 필요없음
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
			pstmt.setString(1,dto.getUserId());
			pstmt.setString(2,dto.getUserName());
			pstmt.setString(3,dto.getUserPass());
			pstmt.setString(4,dto.getTitle());
			pstmt.setString(5,dto.getContent());
			pstmt.setString(6,dto.getUserIcename());
			
			//4. result
			// select : executeQuery
			// inser, update, delete : executeUdate
			if(pstmt.executeUpdate()>0) {result=1;}
			///////////////////////////////////////////////
		}catch(Exception e) {e.printStackTrace();
		} finally {
			if( rset  != null ) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if( pstmt != null ) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if( conn  != null ) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
		return result;
	}// end insert
	////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////
	/////////////////=> 전체글 가져오기
	public ArrayList<BeraDto> selectAll(){
		
		ArrayList<BeraDto> result = new ArrayList<>();
		String sql =" select * from brboard ";
		
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
			
			// 4. Result
			rset = pstmt.executeQuery();
			while(rset.next()) {
				result.add(new BeraDto(
						rset.getInt("idNum"), 
						rset.getString("userId"), 
						rset.getString("userName"), 
						rset.getString("userPass"),
						rset.getString("title"),
						rset.getString("content"),
						rset.getString("userIcename"), 
						rset.getTimestamp("writeDate").toLocalDateTime() , 
						rset.getInt("hit")
					));
			}
			
			///////////////////////////////////////////////
		}catch(Exception e) {e.printStackTrace();
		} finally {
			if( rset  != null ) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if( pstmt != null ) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if( conn  != null ) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
		return result;
	}//////////////////////// end selectAll		
	////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////
	/////////////////=> 글 번호와가 같은값 가져오기
	public BeraDto select(int idNum) {
	
		BeraDto result = new BeraDto();
		String sql  ="select * from brboard  where idNum=?";
		Connection conn = null; PreparedStatement pstmt = null;  ResultSet rset = null;
		String driver="oracle.jdbc.driver.OracleDriver";
		String    url="jdbc:oracle:thin:@localhost:1521:xe";
		String   user="scott" , pass="tiger";
		// 드 커 프 리 
		try {
			//1. 드라이버연동
			Class.forName(driver);
			//2. 커넥션 
			conn = DriverManager.getConnection(url, user, pass);
			//3. PSTMT
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idNum);
			//4. RESULT
			rset = pstmt.executeQuery();
	
			while(rset.next()) {
				result = new BeraDto(
						rset.getInt("idNum"), 
						rset.getString("userId"), 
						rset.getString("userName"), 
						rset.getString("userPass"),
						rset.getString("title"),
						rset.getString("content"),
						rset.getString("userIcename"), 
						rset.getTimestamp("writeDate").toLocalDateTime() , 
						rset.getInt("hit")
						);
						
			}
		} catch (Exception e) { e.printStackTrace();
		} finally {
			if( rset  != null ) { try { rset.close(); } catch (Exception e) { e.printStackTrace(); } }
			if( pstmt != null ) { try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); } }
			if( conn  != null ) { try { conn.close(); } catch (Exception e) { e.printStackTrace(); } }
		} 

		return result;
	}//////////////////////// end selectId
	////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////
	   public  int  update_hit( int idNum ){
		   
		      int result = -1;
		      String sql = " update brboard set hit = hit+1 where idNum=?  ";
		      // 드 커 프 리
				Connection conn = null; PreparedStatement pstmt = null;  ResultSet rset = null;
				String driver="oracle.jdbc.driver.OracleDriver";
				String    url="jdbc:oracle:thin:@localhost:1521:xe";
				String   user="scott" , pass="tiger";
				// 드 커 프 리 
				try {
					//1. 드라이버연동 
					Class.forName(driver);
					//2. 커넥션 
					conn = DriverManager.getConnection(url, user, pass);
					//3. PSTMT
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1,idNum);
					//4. RESULT
					int presult = pstmt.executeUpdate();
					if(presult>0) {result = 1;}
				} catch (Exception e) { e.printStackTrace();
				} finally {
					if( rset  != null ) { try { rset.close(); } catch (Exception e) { e.printStackTrace(); } }
					if( pstmt != null ) { try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); } }
					if( conn  != null ) { try { conn.close(); } catch (Exception e) { e.printStackTrace(); } }
				} 
		      
		      return result;
		  }//////////////////////// end update_Hit
		////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////
		public int update(BeraDto dto) {
			int result = -1;
			String sql = " update brboard set userId=?, userName=?, userPass=?, title=?, content=?, userIcename=? where idNum=?";
			
			Connection conn = null; PreparedStatement pstmt = null;  ResultSet rset = null;
			String driver="oracle.jdbc.driver.OracleDriver";
			String    url="jdbc:oracle:thin:@localhost:1521:xe";
			String   user="scott" , pass="tiger";
			
			try {
				Class.forName(driver); 
				conn = DriverManager.getConnection(url, user, pass); 
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,dto.getUserId());
				pstmt.setString(2,dto.getUserName());
				pstmt.setString(3,dto.getUserPass());
				pstmt.setString(4,dto.getTitle());
				pstmt.setString(5,dto.getContent());
				pstmt.setString(6,dto.getUserIcename());
				pstmt.setInt(7, dto.getIdNum()); 

				System.out.println("3"  );
				int presult = pstmt.executeUpdate();
				System.out.println("4" + presult);
				
				if(presult>0) {result=1;}
			} catch (Exception e) { e.printStackTrace();
			} finally {
				if( rset  != null ) { try { rset.close(); } catch (Exception e) { e.printStackTrace(); } }
				if( pstmt != null ) { try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); } }
				if( conn  != null ) { try { conn.close(); } catch (Exception e) { e.printStackTrace(); } }
			}
			
			return result;
		}//////////////////////// end update
		////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////
		public int delete (BeraDto dto) {
		      int result = -1;
		      String sql = "delete from brboard where idNum=? and userPass=?";
		      // 드 커 프 리
				Connection conn = null; PreparedStatement pstmt = null;  ResultSet rset = null;
				String driver="oracle.jdbc.driver.OracleDriver";
				String    url="jdbc:oracle:thin:@localhost:1521:xe";
				String   user="scott" , pass="tiger";
				// 드 커 프 리 
				try {
					//1. 드라이버연동 
					Class.forName(driver);
					//2. 커넥션 
					conn = DriverManager.getConnection(url, user, pass);
					//3. PSTMT
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1,dto.getIdNum());
					pstmt.setString(2,dto.getUserPass());
					//4. RESULT
					int presult = pstmt.executeUpdate();
					if(presult > 0) {result =1;}
				} catch (Exception e) { e.printStackTrace();
				} finally {
					if( rset  != null ) { try { rset.close(); } catch (Exception e) { e.printStackTrace(); } }
					if( pstmt != null ) { try { pstmt.close(); } catch (Exception e) { e.printStackTrace(); } }
					if( conn  != null ) { try { conn.close(); } catch (Exception e) { e.printStackTrace(); } }
				} 
		      
		      return result;
		}
	   
}


/*
select * from brboard;

select * from brboard  where user_id=2;
select * from brboard  where user_id=?

update brboard set view_count = view_count+1 where user_id=2; 
update brboard set view_count = view_count+1 where user_id=? 

update brboard set title='1', content='1', WRITER_ID='1', icename='1' where user_id=2;
update brboard set title=?, content=?, WRITER_ID=?, icename=? where user_id=?

delete from brboard where user_id=2
delete from brboard where user_id=?
*/
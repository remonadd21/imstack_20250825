package com.company.dao;

import java.net.InetAddress;
import java.sql.*;
import java.util.ArrayList;

import com.company.dbmanager.DBManager;
import com.company.dto.M21DTO;

public class M21DAO {

	/////////////////////////////////////////////////////
	public ArrayList<M21DTO> listAll(){ 
		ArrayList<M21DTO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		DBManager db = new DBManager();
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement("select * from mvcboard3 order by bno desc");
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new M21DTO(rset.getInt("bno"), rset.getString("bname"), rset.getString("bpass"), rset.getString("btitle"),
						rset.getString("bcontent"), rset.getString("bdate"), rset.getInt("bhit"), rset.getString("bip"), rset.getString("bcategory")
						));
			}
		}catch (Exception e) { e.printStackTrace(); }
		finally {
			if(rset!=null) {try{rset.close();}catch (Exception e) { e.printStackTrace(); }}
			if(pstmt!=null) {try{pstmt.close();}catch (Exception e) { e.printStackTrace(); }}
			if(conn!=null) {try{conn.close();}catch (Exception e) { e.printStackTrace(); }}
		}
		return list;
	}
	
	/////////////////////////////////////////////////////
	public int listTotal() { 
		int total = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		DBManager db = new DBManager();
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement("select count(*) as total from mvcboard3");
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				total = rset.getInt("total");
			}
		}catch (Exception e) { e.printStackTrace(); }
		finally {
			if(rset!=null) {try{rset.close();}catch (Exception e) { e.printStackTrace(); }}
			if(pstmt!=null) {try{pstmt.close();}catch (Exception e) { e.printStackTrace(); }}
			if(conn!=null) {try{conn.close();}catch (Exception e) { e.printStackTrace(); }}
		}
		return total;
	}
	
	/////////////////////////////////////////////////////
	public int write(M21DTO dto) { 
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		DBManager db = new DBManager();
		
		try {
			conn = db.getConnection();
//			pstmt = conn.prepareStatement("insert into mvcboard3 (bno, bname, bpass, btitle, bcontent, bip, bcategory) values "
//													+ " (seq_mvcboard3.nextval, ?, ?, ?, ?, ?, ?)");
			pstmt = conn.prepareStatement("insert into mvcboard3 ( bname, bpass, btitle, bcontent, bip, bcategory) values "
					+ " ( ?, ?, ?, ?, ?, ?)");

			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getBpass());
			pstmt.setString(3, dto.getBtitle());
			pstmt.setString(4, dto.getBcontent());
			pstmt.setString(5, "" + InetAddress.getLocalHost().getAddress());
			pstmt.setString(6, dto.getBcategory());
			
			result = pstmt.executeUpdate();
			
		}catch (Exception e) { e.printStackTrace(); }
		finally {
			if(pstmt!=null) {try{pstmt.close();}catch (Exception e) { e.printStackTrace(); }}
			if(conn!=null) {try{conn.close();}catch (Exception e) { e.printStackTrace(); }}
		}
		return result;
	}
	
	/////////////////////////////////////////////////////
	public M21DTO detail(M21DTO dto) { 
		M21DTO detail = new M21DTO();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		DBManager db = new DBManager();
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement("select * from mvcboard3 where bno=?");
			pstmt.setInt(1, dto.getBno());
			rset= pstmt.executeQuery();
			while(rset.next()) {
				detail.setBno(rset.getInt("bno"));
				detail.setBname(rset.getString("bname"));
				detail.setBpass(rset.getString("bpass"));
				detail.setBtitle(rset.getString("btitle"));
				detail.setBcontent(rset.getString("bcontent"));
				detail.setBdate(rset.getString("bdate"));
				detail.setBhit(rset.getInt("bhit"));
				detail.setBip(rset.getString("bip"));
				detail.setBcategory(rset.getString("bcategory"));
			}
			
		}catch (Exception e) { e.printStackTrace(); }
		finally {
			if(rset!=null) {try{rset.close();}catch (Exception e) { e.printStackTrace(); }}
			if(pstmt!=null) {try{pstmt.close();}catch (Exception e) { e.printStackTrace(); }}
			if(conn!=null) {try{conn.close();}catch (Exception e) { e.printStackTrace(); }}
		}
		return detail;
	}
	
	/////////////////////////////////////////////////////
	public int addHit(M21DTO dto) { 
		int result = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		DBManager db = new DBManager();
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement("update mvcboard3 set bhit=bhit+1 where bno=?");
			pstmt.setInt(1, dto.getBno());

			result = pstmt.executeUpdate();
			
		}catch (Exception e) { e.printStackTrace(); }
		finally {
			if(pstmt!=null) {try{pstmt.close();}catch (Exception e) { e.printStackTrace(); }}
			if(conn!=null) {try{conn.close();}catch (Exception e) { e.printStackTrace(); }}
		}
		return result;
	}
	
	/////////////////////////////////////////////////////
	public int checkPass(M21DTO dto) { 
		int result = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		DBManager db = new DBManager();
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement("select count(*) as check_pass from mvcboard3 where bno=? and bpass=?");
			pstmt.setInt(1, dto.getBno());
			pstmt.setString(2, dto.getBpass());
			rset= pstmt.executeQuery();
			while(rset.next()) { result = rset.getInt("check_pass"); }
			
		}catch (Exception e) { e.printStackTrace(); }
		finally {
			if(rset!=null) {try{rset.close();}catch (Exception e) { e.printStackTrace(); }}
			if(pstmt!=null) {try{pstmt.close();}catch (Exception e) { e.printStackTrace(); }}
			if(conn!=null) {try{conn.close();}catch (Exception e) { e.printStackTrace(); }}
		}
		return result;
	}
	
	/////////////////////////////////////////////////////
	public int edit(M21DTO dto) { 
		int result = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		DBManager db = new DBManager();
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement("update mvcboard3 set btitle=?, bcontent=? where bno=?");
			pstmt.setString(1, dto.getBtitle());
			pstmt.setString(2, dto.getBcontent());
			pstmt.setInt(3, dto.getBno());
			result = pstmt.executeUpdate();
			
		}catch (Exception e) { e.printStackTrace(); }
		finally {
			if(pstmt!=null) {try{pstmt.close();}catch (Exception e) { e.printStackTrace(); }}
			if(conn!=null) {try{conn.close();}catch (Exception e) { e.printStackTrace(); }}
		}
		return result;
	}
	/////////////////////////////////////////////////////
	public int delete(M21DTO dto) {
		int result = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		DBManager db = new DBManager();
		
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement("delete from mvcboard3 where bno=?");
			pstmt.setInt(1, dto.getBno());
			result = pstmt.executeUpdate();
			
		}catch (Exception e) { e.printStackTrace(); }
		finally {
			if(pstmt!=null) {try{pstmt.close();}catch (Exception e) { e.printStackTrace(); }}
			if(conn!=null) {try{conn.close();}catch (Exception e) { e.printStackTrace(); }}
		}
		return result;
	}
	
	
}

package com.bera.dao; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bera.dto.BeraUserDto;

public class BeraUserDao {

    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "scott", pass = "tiger";

    ///////////////////////// 회원가입
    public int insert(BeraUserDto dto) {
        int result = -1;
        String sql = "INSERT INTO bruser (userid, email, pass, birth, gender, joindate, agree) " +
                     "VALUES (BRUSER_seq.NEXTVAL, ?, ?, ?, ?, SYSDATE, ?)";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getEmail());
            pstmt.setString(2, dto.getPass());
            pstmt.setString(3, dto.getBirth());
            pstmt.setString(4, dto.getGender());
            pstmt.setString(5, dto.getAgree());

            if (pstmt.executeUpdate() > 0) result = 1;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }

        return result;
    }

    ///////////////////////// 로그인
    public int login(int userid, String passw) {
        int result = -1;
        String sql = "SELECT count(*)  cnt FROM bruser WHERE userid = ? AND pass = ?";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userid);
            pstmt.setString(2, passw);
            rset = pstmt.executeQuery();
            
            if (rset.next()) {
                result =  rset.getInt("cnt") ;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rset != null) rset.close(); } catch (SQLException e) {}
            try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }

        return result;
    }

    ///////////////////////// 마이페이지 조회
    public BeraUserDto select(int userid) {
        BeraUserDto result = null;
        String sql = "SELECT * FROM bruser WHERE userid = ?";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userid);
            rset = pstmt.executeQuery();

            if (rset.next()) {
                result = new BeraUserDto(
                    rset.getInt("userid"),
                    rset.getString("email"),
                    rset.getString("pass"),
                    rset.getString("birth"),
                    rset.getString("gender"),
                    rset.getDate("joindate"),
                    rset.getString("agree")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rset != null) rset.close(); } catch (SQLException e) {}
            try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }

        return result;
    }

    ///////////////////////// 마이페이지 수정
    public int update(BeraUserDto dto) {
        int result = -1;
        String sql = "UPDATE bruser SET email = ?, birth = ?, gender = ?, agree = ? " +
                     "WHERE userid = ? AND pass = ?";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getEmail());
            pstmt.setString(2, dto.getBirth());
            pstmt.setString(3, dto.getGender());
            pstmt.setString(4, dto.getAgree());
            pstmt.setInt(5, dto.getUserid());
            pstmt.setString(6, dto.getPass());

            if (pstmt.executeUpdate() > 0) result = 1;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }

        return result;
    }

    ///////////////////////// 회원 탈퇴
    public int delete(int userid, String passw) {
        int result = -1;
        String sql = "DELETE FROM bruser WHERE userid = ? AND pass = ?";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, userid);
            pstmt.setString(2, passw);

            if (pstmt.executeUpdate() > 0) result = 1;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (pstmt != null) pstmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }

        return result;
    }
}


/*

CREATE TABLE bruser(
    userid VARCHAR2(20)   PRIMARY KEY,         -- 사용자 고유 ID
    email  VARCHAR2(100),                      -- 이메일
    pass   VARCHAR2(100),
    birth   VARCHAR(100),                               -- 생년월일
    gender          VARCHAR(50)    default   'F'    ,                            -- 성별 (M/F)
    joindate       VARCHAR(100)  default sysdate ,               -- 가입일
    agree           VARCHAR(50)     default   'y'     -- 마케팅 수신 동의 여부 (Y/N)
);
CREATE SEQUENCE BRUSER_seq;


*/
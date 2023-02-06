package com.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.study.vo.MemverVO;

//싱글톤
public class MemberDAO {
	
	//싱글톤은 생성자가 private
	//그래야 다른 class나 등등에서 객체생성을 못함
	private MemberDAO() {
		
	}
	
	//객체 생성 private 다른데에서 수정같은걸 못하게 방지
	//static 정적 객체로 생성(메모리에 공유가 됨)
	private static MemberDAO instance = new MemberDAO();
	
	//생성한 객체를 호출(리턴)하는 메서드
	//수정은 못함 get가능 (읽기전용)
	public static MemberDAO getInstance() {
		 return instance;
	 }
	
	//커넥션 풀 get하는 메서드
	public Connection getConnection() throws Exception {
		
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		Connection conn = ds.getConnection();
		
		return conn;
	}
		// 아이디 비번 체크하는 메서드 
	 
	public int userCheck(String id, String pw) {
		int result = -1; // 결과 저장 변수
		
		String sql = "select pw from member where userid=?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
	    try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
		
		if(rs.next()) {
			if(rs.getString("pw")!=null && rs.getString("pw").equals(pw)) {
				result = 1; // 아이디 비번 모두 일치
			} else {
				result = 0; // 아이디는 일치, 비번은 일치하지 않음
			}
			
		}else {
			result = -1; //입력한 아이디가 없음 
		}
	    
	    
	    } catch (Exception e) {
	    	e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    return result;
	}
	//로그인 성공한 사람의 정보를 빼오는 검색문
	public MemverVO getMember(String id) {
		MemverVO vo = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql ="select*from member where userid=?";
	

	    try {
			conn = getConnection(); // 자바랑 데이터베이스 연결 완료
			pstmt = conn.prepareStatement(sql); // sql문을 가지고 있음, 아직 실행x
			pstmt.setString(1, id); // 바인딩시키면서 sql문 완성
			rs = pstmt.executeQuery(); // sql문 실행이 돼서 리턴된 것이 rs에 보관
		
		if(rs.next()) {
			vo = new MemverVO();
			
			vo.setName(rs.getString("name"));
			vo.setId(rs.getString("userid"));
			vo.setPw(rs.getString("pw"));
			vo.setEmail(rs.getString("email"));
			vo.setPhone(rs.getString("phone"));
			vo.setAdmin(rs.getInt("admin"));
			}
		} catch (Exception e) {
		    	e.printStackTrace();
			} finally {
				try {
					if(rs != null)
						rs.close();
					if(pstmt != null)
						pstmt.close();
					if(conn != null)
						conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				return vo;
			
			}	
	  public int confirmID(String id) {
		  int result = -1; // 중복검사 결과 저장
		  
		  Connection conn = null;
		  PreparedStatement pstmt = null;
		  ResultSet rs = null;
		  
		  String sql = "select userid from member where userid=?";
		 
		  try {
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
			
			if(rs.next()) {
					result = 1; // 중복된 아이디가 있음
				} else {
					result = -1; //  중복된 아이디가 없음 
				
			 }
		  } catch (Exception e) {
		    	e.printStackTrace();
			} finally {
				
				try {
					if(rs != null)
						rs.close();
					if(pstmt != null)
						pstmt.close();
					if(conn != null)
						conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		    return result;
		}
	  //insert 메서드
	  public int insertMember(MemverVO vo) {
		  int result=0; // insert 실행결과를 저장
		  
			Connection conn = null;
			PreparedStatement pstmt = null;
	  
			String sql = "insert into member values(?,?,?,?,?,?)";

			try {
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, vo.getName());
				pstmt.setString(2, vo.getId());
				pstmt.setString(3, vo.getPw());
				pstmt.setString(4, vo.getEmail());
				pstmt.setString(5, vo.getPhone());
				pstmt.setInt(6, vo.getAdmin());
			
				result=pstmt.executeUpdate(); // sql 작동, 결과값 return해주는 메서드 
			  } catch (Exception e) {
			    	e.printStackTrace();
				} finally {
					
					try {
						if(pstmt != null)
							pstmt.close();
						if(conn != null)
							conn.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			    return result;
			}
		}







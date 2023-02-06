package com.study.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.dao.MemberDAO;
import com.study.vo.MemverVO;


@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public JoinServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("member/join.jsp");
		dispatcher.forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String admin = request.getParameter("admin");
	
		MemverVO vo = new MemverVO();
		
		vo.setName(name);
		vo.setId(id);
		vo.setPw(pw);
		vo.setEmail(email);
		vo.setPhone(phone);
		vo.setAdmin(Integer.parseInt(admin));
		
		MemberDAO dao = MemberDAO.getInstance();
		//		회원가입 성공:1 회원가입 실패:0
		//		dao에서 insert 실행시키는 sql 작업
		int result = dao.insertMember(vo);
		String url =null;
		
		if (result==1) {
			request.setAttribute("msg", "회원가입에 성공했습니다.");
			url = "member/login.jsp";
		} else {
			request.setAttribute("msg", "회원가입에 실패했습니다.");
			url = "member/join.jsp";
		}
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
	
	}
}

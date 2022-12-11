package _08_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/myPage")
public class MyPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 세션 정보 가져오기
		HttpSession session = request.getSession(); 		// session 객체를 생성하여
		String id = (String) session.getAttribute("id");	// getAttribute(); 메서드를 통하여 세션 정보를 가져온다.
		
		/*
		 
		 	세션을 이용하여 관련 정보를 DB에서 가져오는 비즈니스 로직
		
			request.setAttribute("DB에서 가져온 정보", DB에서 가져온 정보);
			
		*/
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter08_servlet/05_myPage.jsp");
		dis.forward(request, response);
		
	}

}

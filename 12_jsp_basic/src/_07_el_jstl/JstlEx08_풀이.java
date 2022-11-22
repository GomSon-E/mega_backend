package _07_el_jstl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JstlEx08_풀이
 */
@WebServlet("/JstlEx08_풀이")
public class JstlEx08_풀이 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		로그인 성공
//		request.setAttribute("id", "qwer1234");
//		request.setAttribute("pw", "1234");
		
//		로그인 실패
		request.setAttribute("id", "asdf1234");
		request.setAttribute("pw", "1234");
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter07_el_jstl/jstlEx08_풀이.jsp");
		dis.forward(request, response);
		
	}

}

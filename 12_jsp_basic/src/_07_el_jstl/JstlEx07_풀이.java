package _07_el_jstl;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JstlEx07_풀이
 */
@WebServlet("/JstlEx07_풀이")
public class JstlEx07_풀이 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Random rd = new Random();
		int meNum = rd.nextInt(3);
		String me = "";
		
		if (meNum == 0) {
			me = "가위";
		}
		else if (meNum == 1) {
			me = "바위";
		}
		else {
			me = "보";
		}
		
		request.setAttribute("me", me);
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter07_el_jstl/jstlEx07_풀이.jsp"); 
		dis.forward(request, response);
		
	}
}

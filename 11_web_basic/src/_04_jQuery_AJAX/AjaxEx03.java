package _04_jQuery_AJAX;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajaxEx03")
public class AjaxEx03 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dis = request.getRequestDispatcher("04_jQuery/chapter04_AJAX/ajaxEx03.jsp");
		dis.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 반환되는 데이터의 한글 encoding 지정
		response.setContentType("text/html; charset=UTF-8");
		
		// out.print()메서드를 통해서 AJAX로 데이터를 전송한다
		PrintWriter out = response.getWriter();
		out.print("반환되는 데이터"); // AJAX success의 data로 넘어감
	}
	
}

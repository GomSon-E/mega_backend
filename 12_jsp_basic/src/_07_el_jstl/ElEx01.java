package _07_el_jstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ElEx01")
public class ElEx01 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("name", "Timothy");
		request.setAttribute("num1", 12);
		request.setAttribute("num2", 3);
		
		ArrayList<String> list1 = null;
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("data1");
		list3.add("data2");
		list3.add("data3");
		
		request.setAttribute("list1", list1);
		request.setAttribute("list2", list2);
		request.setAttribute("list3", list3);
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter07_el_jstl/elEx01.jsp");
		dis.forward(request, response);
		
	}


}

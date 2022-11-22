package _07_el_jstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _05_bean.ProductBean;

@WebServlet("/JstlEx03")
public class JstlEx03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String[] datas = {"하나", "둘", "셋", "넷", "다섯"};
		request.setAttribute("datas", datas);
		
//		 ArrayList<ProductBean> productList = new ArrayList<ProductBean>();
		
		ArrayList<ProductBean> productList = new ArrayList<ProductBean>();
		for (int i = 1; i < 10; i++) {
			ProductBean product = new ProductBean();
			product.setPdCd("P00" + i);
			product.setPdNm("기계식키보드" + i);
			product.setDeptCd("dept" + i);
			product.setDeptNm("생산부서" + i);
			product.setMgrCd("mgr" + i);
			product.setMgrNm("홍길동" + i);
			productList.add(product);
		}
		
		request.setAttribute("productList", productList);
		
		RequestDispatcher dis = request.getRequestDispatcher("chapter07_el_jstl/jstlEx03.jsp");
		dis.forward(request, response);
	}

}

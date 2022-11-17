<%@page import="_05_bean.ProductBean"%>
<%@page import="_05_bean.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>beanPro</title>
</head>
<body>

	<%
		request.setCharacterEncoding("utf-8");	
	
		ProductBean bean1 = new ProductBean();
		bean1.setPdCd(request.getParameter("pdCd"));
		bean1.setPdNm(request.getParameter("pdNm"));
		bean1.setDeptCd(request.getParameter("deptCd"));
		bean1.setDeptNm(request.getParameter("deptNm"));
		bean1.setMgrCd(request.getParameter("mgrCd"));
		bean1.setMgrNm(request.getParameter("mgrNm"));
	%>
	
	<jsp:useBean id="bean2" class="_05_bean.ProductBean">
		<jsp:setProperty property="pdCd" name="bean2"/>
		<jsp:setProperty property="pdNm" name="bean2"/>
		<jsp:setProperty property="deptCd" name="bean2"/>
		<jsp:setProperty property="deptNm" name="bean2"/>
		<jsp:setProperty property="mgrCd" name="bean2"/>
		<jsp:setProperty property="mgrNm" name="bean2"/>
	</jsp:useBean>
	
	<jsp:useBean id="bean3" class="_05_bean.ProductBean">
		<jsp:setProperty property="*" name="bean3"/>		
	</jsp:useBean>
	
	<%
		ProductDao productDao = new ProductDao();
	
		productDao.printData(bean1);
		productDao.printData(bean2);
		productDao.printData(bean3);
	%>

	<p>bean1 : <%=bean1.getPdNm() %> , X</p>
	<p>bean1 : <%=bean2.getPdNm() %> , <jsp:getProperty property="pdNm" name="bean2"/></p>
	<p>bean1 : <%=bean3.getPdNm() %> , <jsp:getProperty property="pdNm" name="bean3"/></p>

</body>
</html>
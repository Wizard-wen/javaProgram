package com.itheima.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletDemo1
 */
@WebServlet("/servletDemo1")
public class servletDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//服务器中默认的编码是ISO-8859-1，不支持中文，tomcat规定的
		
		//告诉服务器，应该使用utf-8来解析数据
		response.setCharacterEncoding("UTF-8");
		
		//告诉客户端要使用什么编码
//		response.setHeader("content-type", "text/html;charset=UTF-8");
		
		//告诉服务器、客户端使用什么方式来解析文本
		response.setContentType("text/html;charset=GBK");
		
		
		PrintWriter out = response.getWriter();
//		out.write("<html><head><meta charset='utf-8'></meta></head><body>你好</body></html>");
		out.write("你好！");
		
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

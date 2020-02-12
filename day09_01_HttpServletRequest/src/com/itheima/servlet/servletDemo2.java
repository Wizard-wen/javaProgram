package com.itheima.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletDemo2
 */
@WebServlet("/servletDemo2")
public class servletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletDemo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//获得请求消息头的信息
		
		String header = request.getHeader("User-Agent");
		System.out.println(header);
		
		test1(header); 
		
		//获取所有请求消息头的name
	}

	private void test1(String header) {
		if(header.toLowerCase().contains("msie")){
			System.out.println("你是使用的是ie浏览器");
		} else if(header.toLowerCase().contains("firefox")){
			System.out.println("你是使用的是firefox浏览器");
		} else if(header.toLowerCase().contains("chrome")){
			System.out.println("你是使用的是chrome浏览器");
		} else {
			System.out.println("你是使用的是其他浏览器");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

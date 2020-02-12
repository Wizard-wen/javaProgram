package com.itheima.servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.entity.user;

/**
 * Servlet implementation class servletDemo3
 */
@WebServlet("/servletDemo3")
public class servletDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletDemo3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		//先告诉服务器要使用什么编码，注，浏览器使用的是什么编码，穿过老的就是什么编码
		request.setCharacterEncoding("UTF-8");
		
		user u = new user();
		System.out.println("封装数据前"+u);
		//封装表单数据
		Map<String, String[]> map = request.getParameterMap();
		
		for(Map.Entry<String, String[]> m : map.entrySet()) {
			String name = m.getKey();
			String[] value = m.getValue();
			
			//创建一个属性描述器
			if(value.length == 1) {
				
			} else {
				
			}
		}
		System.out.println("封装数据后"+u);
		//test2(request);
		
		//test1(request);
	}

	private void test2(HttpServletRequest request) {
		//获取所有表单name的名字
		Enumeration names = request.getParameterNames();
		
		
		while(names.hasMoreElements()) {
			String name = (String) names.nextElement(); //得到每一个name名
			//System.out.println(name);
			String [] values = request.getParameterValues(name);
			for (int i = 0;values!= null && i< values.length; i++) {
				System.out.println(name+":  "+values[i]);
			}
		}
	}

	private void test1(HttpServletRequest request) {
		
		//获取表单数据
		
		//根据表单中name属性的名，获取value属性的值方法
		String userName = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		String sex = request.getParameter("sex");
		String[] hobby = request.getParameterValues("hobby");
		String city = request.getParameter("city");
		
		System.out.println(userName);
		System.out.println(pwd);
		System.out.println(sex);
		for(int i = 0; hobby !=null && i< hobby.length; i++) {
			System.out.println(hobby[i]);
		}
		System.out.println(city);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

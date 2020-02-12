package com.itheima.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		
		//通过路径得到一个输出流
		String path = this.getServletContext().getRealPath("/WEB-INF/classes/美女.jpg");
		System.out.println(path);
		FileInputStream fis = new FileInputStream(path);
		//创建字节输出流
		ServletOutputStream sos = response.getOutputStream();
		
		//得到要下载的文件名
		String filename = path.substring(path.lastIndexOf("/")+1);
		System.out.println(filename);
		//设置文件名的编码
		filename = URLEncoder.encode(filename,"UTF-8"); //将不安全文件名改为utf-8
		//告知客户端要下载文件
		response.setHeader("content-disposition", "attachment;filename="+filename);
		response.setHeader("content-type", "image/jpeg");
		
		//执行输出操作
		int len = 1;
		byte[] b = new byte[1024];
		while((len = fis.read(b))!= -1) {
			sos.write(b, 0 ,len);
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

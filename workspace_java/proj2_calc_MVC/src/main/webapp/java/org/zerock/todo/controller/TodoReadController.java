package org.zerock.todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.todo.dto.TodoDTO;
import org.zerock.todo.service.TodoService;

@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("/todo/resd");
		
		String str_tno = request.getParameter("tno");
		System.out.println("str_tno" + str_tno);
		
		int tno2 = Integer.parseInt(str_tno);
		
		TodoService todoService = new TodoService();
		TodoDTO tododto = todoService.get(tno2);
		
		request.setAttribute("dto", dto2);
		request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request, response);
		
		
	}

}

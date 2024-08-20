package org.zerock.todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.todo.dto.TodoDTO;
import org.zerock.todo.service.TodoService;


@WebServlet("/todo/register")
public class TodoRegisterContorller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register doGet실행");
		
		request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register doPost실행");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		String title = request.getParameter("title");
		String dueDate = request.getParameter("dueDate");
		String finished = request.getParameter("finished");
		
		TodoDTO todoDTO =  new TodoDTO();
		todoDTO.setTitle(title);
		todoDTO.setDueDate(LocalDate.parse(dueDate));
		if("N".equals(finished)) {
			todoDTO.setFinished(false);
		}else {
			todoDTO.setFinished(true);
		}
		System.out.println(todoDTO);
		
		TodoService todoService = new TodoService();
		int result = todoService.register(todoDTO);
		System.out.println("insert결과 : "+ result);
		
//		response.sendRedirect("list");
//		response.sendRedirect("/_proj3_todo/todo/list");
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/todo/list");
		
	}

}

package org.zerock.todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.todo.service.TodoService;

@WebServlet("/remove")
public class TodoRemovecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String str_tno = request.getParameter("tno");
		int tno = Integer.parseInt(str_tno);
		
		TodoService service = new TodoService();
		int result = service.remove(tno);
		
	}

}

package org.zerock.todo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.todo.dto.TodoDTO;
import org.zerock.todo.service.TodoService;

@WebServlet("/todo/list")
public class TodoListController extends HttpServlet {
	
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		System.out.println("/todo/read");
//		
//		//todo/resd?=tno=123
//		int tno = Integer.parseInt(request.getParameter("tno"));
//		
//		TodoDTO dto = TodoService.INSTANCE.get(tno);
//		
//		request.setAttribute("dto", dto);
//		
//		request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response);
//		
//	}
//}





    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("/todo/list doGet 실행");

        TodoService todoService = new TodoService(); // 싱글톤으로Service를 new해준것을 생략함
        List<TodoDTO> todoList = todoService.getList();

        request.setAttribute("list1", todoList);

        request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response);


    }

}

package org.zerock.todo.service;

import org.zerock.todo.dao.TodoDAO;
import org.zerock.todo.dto.TodoDTO;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//public enum TodoService{
//	 INSTANCE;

public class TodoService {
    public int register(TodoDTO todoDTO) {
       
    	TodoDAO todoDAO = new TodoDAO();
    	return todoDAO.insert(todoDTO);
    }
    public List<TodoDTO> getList(){
        //DB에서 select 밑 코드는 임시 코드

        List<TodoDTO> list = new ArrayList<TodoDTO>();

        TodoDAO tododao = new TodoDAO();
        list = tododao.selectAll();
        return list;

    }
        public TodoDTO get(int tno1) {
        	
        	TodoDTO dto1 = new TodoDTO();
        	TodoDAO dao1 = new TodoDAO();
        	dto1 = dao1.selectOne(tno1);
        	
        	return dto1;
    }
}
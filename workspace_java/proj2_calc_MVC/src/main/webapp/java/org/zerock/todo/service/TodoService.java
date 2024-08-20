package org.zerock.todo.service;

import org.zerock.todo.dto.TodoDTO;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//public enum TodoService{
//	 INSTANCE;

public class TodoService {
    public void register(TodoDTO todoDTO) {
        System.out.println("등록중..."+todoDTO.toString());
    }
    public List<TodoDTO> getList(){
        //DB에서 select 밑 코드는 임시 코드

        List<TodoDTO> list = new ArrayList<TodoDTO>();

        for(int i = 0; i<10; i++) {
            TodoDTO dto = new TodoDTO();
            dto.setTno(i);
            dto.setTitle("todo..."+i);
            dto.setDueDate(LocalDate.now());

            list.add(dto);

                }
 

        return list;

    }
        public TodoDTO get(int tno1) {
        	
        	TodoDTO dto1 = new TodoDTO();
        	dto1.setTno(tno1);
        	dto1.setTitle(tno1 + "번쨰 글");
        	dto1.setDueDate(LocalDate.now());
        	dto1.setFinished(true);
        	
        	return dto1;
    }
}
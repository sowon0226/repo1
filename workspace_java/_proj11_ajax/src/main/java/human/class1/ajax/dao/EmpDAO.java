package human.class1.ajax.dao;

import java.util.List;

import human.class1.ajax.dto.EmpDTO;

public interface EmpDAO {

	List selectEmp();
	
	int deleteEmp(EmpDTO dto);
}

package human.class1.ajax.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import human.class1.ajax.dao.EmpDAO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List listEmp() {
		
		List<EmpDAO> list = empDAO.selectEmp();
		
		return list;
	}
}

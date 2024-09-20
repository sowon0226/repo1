package emp.crud;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class EmpDAO {
	private  SqlSessionFactory sqlMapper = null;
	
	// SqlMapConfig 를 읽어오는 소스
    public  SqlSessionFactory getInstance() {
        if(sqlMapper == null) {
            try {
                String res = "mybatis/SqlMapConfig.xml";
                Reader reader = Resources.getResourceAsReader(res);

                SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
                sqlMapper = ssfb.build(reader);

                reader.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        return sqlMapper;
    }
    
    public List<EmpDTO> selectEmp () {
    	List list = null;
    	
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
    	SqlSession sqlSession = sqlMapper.openSession();
    	
    	list = sqlSession.selectList("mapper.emp.param.selectAllEmp0");
    	} else {
    		System.out.println("DB 접속 실패");
    	}
    	return list;
    }
    
    
    public int insertEmp (EmpDTO dto) {
    	System.out.println("dao의 insertEmp 실행");
    	int result = -1;
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
    		SqlSession sqlSession = sqlMapper.openSession();
    		
    		try {
    			result = sqlSession.insert("mapper.emp.param.insertEmp", dto);
    			sqlSession.commit();
    			
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	} else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	return result;
    }
    
    public int updateEmp (EmpDTO dto) {
    	System.out.println("dao의 updateEmp 실행");
    	int result = -1;
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
    		SqlSession sqlSession = sqlMapper.openSession();
    		
    		try {
    			result = sqlSession.update("mapper.emp.param.updateEmp", dto);
    			sqlSession.commit();
    			
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	} else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	return result;
    }
    
    public int deleteEmp (EmpDTO dto) {
    	System.out.println("dao의 updateEmp 실행");
    	int result = -1;
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
    		SqlSession sqlSession = sqlMapper.openSession();
    		
    		try {
    			result = sqlSession.delete("mapper.emp.param.deleteEmp", dto);
    			sqlSession.commit();
    			
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	} else {
    		System.out.println("DB 접속 실패");
    	}
    	
    	return result;
    }
    public List<emp.crud.EmpDTO> selectEmpList (emp.crud.EmpDTO empDTO) {
    	List list = null;
    	
    	// SqlMapConfig.xml을 읽어옴
    	sqlMapper = getInstance();
    	
    	if(sqlMapper != null) {
    	// DB 접속
    	// 유 접속 시도
    	SqlSession sqlSession = sqlMapper.openSession();
    	
    	// emp.xml에 있는 mapper의 주소를 namespace.id(select의 id) 로 적어준다.
    	// selectList 는 알아서 list로 돌려주기 때문에 while 이나 for문이 필요 없다.
    	// DB 컬럼명과 필드명, getter, setter의 이름이 같아야 한다.
    	list = sqlSession.selectList("mapper.emp.dynamic.selectEmpList", empDTO);
    	System.out.println("list.size : " + list.size());
    	} else {
    		System.out.println("DB 접속 실패");
    	}
    	return list;
    }
}

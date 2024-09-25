package kr.or.human.member.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

// Spring에서 Bean으로 등록하기
// SQL문을 실행시킬때 예외처리가 어쩌구 저쩌구...(못들었다..)

// 보통은 DAO 클래스에서 사용
@Repository
//@Repository("MemberDAOImpl") 안 쓰는 경우 Bean아이디로 나옴 
public class MemberDAOImpl implements MemberDAO {

	@Override
	public List selectMember() {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		return list;
	}

	
	
}

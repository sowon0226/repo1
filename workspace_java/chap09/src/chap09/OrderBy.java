package chap09;

import java.util.Comparator;

public class OrderBy implements Comparator {

	@Override
	public int compare(Object o1, Object o2) { // 인터페이스에 있는거여서 건들 수가 없다( 남들이 만들것을 가져와서 사용하는중 )
		
		MemberDTO dto1 = (MemberDTO) o1;
		MemberDTO dto2 = (MemberDTO) o2;
		
		return dto1.getAge() - dto2.getAge();
		
	}

}

package sec01.exam01;

public class TryExam {

	public static void main(String[] args) {
		
		try {
		String s1 = null;
//		System.out.println(s1.length()); Exception in thread "main" java.lang.NullPointerException
		System.out.println(s1);
		
		int[] a = new int[2];
//		a[100] = 3;  java.lang.ArrayIndexOutOfBoundsException
		
		String s2 = "20";
		int age = 0;
		
			
		age = Integer.parseInt(s2); // String s2 = "20a";라고 썼을 경우 java.lang.NumberFormatException: 		
		System.out.println(age + 1);
		
		ThrowsTest tt = new ThrowsTest();
//		tt.throwException();
		
		tt.human(3);
		
		}catch (HumanException he) {
			
			String massage = he.getMessage();
			if("EC05".equals(massage)) {
				System.out.println("5미만을 입력하셨군요. 확인해주세요");
			}else if("EC10".equals(massage)){
				System.out.println("10초과해서 입력하셌군요. 확인해주세요");
			}
		
		}catch (Exception e) {
			System.out.println("오류발생");
			System.out.println(e);
			System.out.println("------------");
			
			e.printStackTrace(); // 다른것은 안써도 이것은 꼭 써야함(오류를 알려주는데 오류가 나도 무시하고 출력해줌)
			
			System.out.println("------------");
			System.out.println(e.getMessage());	// 나중에 알려주신다고 하심		
		}
		
		System.out.println("완료");
		
	}

}

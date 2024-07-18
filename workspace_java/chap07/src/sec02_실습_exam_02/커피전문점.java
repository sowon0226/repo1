package sec02_실습_exam_02;

public class 커피전문점 {

	/*
	 * 커피 전문점
	 * boolean isDT(){ return false;} 
	 * void order(String menu){
	 *  syso(menu + "주문 받습니다")}
	 *  
	 *  투썸 extends 커피전문점
	 *  @Override
	 *  boolean isDT(){ return true;} 
	 *  
	 *  나
	 *  coffee(투썸, 별다방, 빽다빵 아무거나 받을 수 있게.
	 *  단, 모두 커피전문점을 상속 받았다){
	 *  if(shop.isDT()){
	 *  syso("드라이브쓰루 이용한다")
        shop.order("따아")
    } else {
		        ...
		    }
		
		}
		
		[나exam]
		    new 투썸
		    new 나
		    나.coffee를 호출해서 투썸에 보낸다
	 */	
	
	boolean isDT(){ 
		return false;}
	
	void order(String menu) {
		System.out.println(menu + "주문을 받습니다");
	}
    void pay(int p) {
    	System.out.println(p + "받았습니다");
    }
}

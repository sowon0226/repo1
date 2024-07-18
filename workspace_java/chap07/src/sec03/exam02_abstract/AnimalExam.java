package sec03.exam02_abstract;

public class AnimalExam {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound(); // 부모가 자식한테 떠넘김
		dog.breathe(); // 부모가 구현을 해놓은것 

		Animal a = dog;
		a.sound();
		
//		Animal a2 = new Animal();// 추상메소드를 가질수 있느나 (생성자를 갖을 수 있으나) new가 안됨
		
	}

}

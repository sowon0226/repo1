package sec02exam01;

public class DriverExam {

	public static void main(String[] args) {
		
		Avante avante = new Avante(); 
		
		Driver driver = new Driver();
		Car car = (Car)avante;
		driver.run(car);
		
		Spark spark = new Spark();
		driver.run(spark);
		
	}

}

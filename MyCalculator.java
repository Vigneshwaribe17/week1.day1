package Assignment2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calulator obj = new Calulator();
		
		int sum=obj.add(5,10,15);
		System.out.println("Addition is "+sum);
		
		int sub= obj.sub(10, 5);
		System.out.println("Subtraction is "+sub);
	
	double mul= obj.mul(10, 20);
			System.out.println("Multiplication is "+mul);
			
			float div= obj.divide(100f, 20f);
			System.out.println("Division is "+div);
	}
	
}

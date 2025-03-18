package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8 ;
		int num1 = 0;
		int num2= 1;
		System.out.println(num1);
		System.out.println(num2);
		for (int i=2; i<range; i++) {
		
		
	int	num3= num2+num1 ;
		
		System.out.println(num3);
		num1=num2;
		num2=num3;
		}
			

	}

}

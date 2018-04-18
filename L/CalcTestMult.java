public class CalcTestMult{
	public static void main(String []args){
		int result1 = Calc.mult(11, 5);
		double result2 = Calc.mult(11, 5);
			if(result1 != 55 && result2 != 55){
			System.out.println("Test failed!");
		}
		else System.out.println("Test Successful");
}
}

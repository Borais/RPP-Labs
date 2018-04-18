public class CalcTestDiv{
	public static void main(String []args){
		int result1 = Calc.div(10, 5);
		double result2 = Calc.div(10, 5);
		if(result1 != 2 && result2 != 2){
			System.out.println("Test failed");
		}
		else System.out.println("Test Successful");
}
}

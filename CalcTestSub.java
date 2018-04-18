public class CalcTestSub{
public static void main(String []args){
		int result1 = Calc.sub(11, 5);
		double result2 = Calc.sub(11, 5);
			if(result1 != 6 && result2 != 6){
			System.out.println("Test failed!");
		}
		else System.out.println("Test Successful");
}
}

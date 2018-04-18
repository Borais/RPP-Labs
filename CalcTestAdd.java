public class CalcTestAdd{
public static void main(String[] args){
	int result1 = Calc.add(2, 2);
	double result2 = Calc.add(2, 2);
	if(result1 != 4 && result2 != 4){
	System.out.println("Test failed");
	}
	else System.out.println("Test Successful");
}
}

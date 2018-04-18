public class Calc{

public static int add(int a,int b){
		return a+b;
}
public static int sub(int a, int b){
	return a-b;
}
public static int mult(int a, int b){
	return a*b;
}
public static int div(int a, int b){
        return a/b;
}
public static double add(double a,double b){
		return a+b;
}
public static double sub(double a, double b){
	return a-b;
}
public static double mult(double a, double b){
	return a*b;
}
public static double div(double a, double b){
        return a/b;
}
public static void main(String[] args){
	int a = 3;
	int b = 6;
	double c = a/4;
	double d = b/2;
	System.out.println(add(a, b) + " \n");
	System.out.println(sub(a, b) + " \n");
	System.out.println(mult(a, b) + " \n");
	System.out.println(div(c, d) + " \n");
}
}

package stu.design.strategy;

public class StrategyTest {
	public static void main(String[] args) {

		String exp = "2-8";
		ICalculator cal = new Minus();
		Double result = cal.calculate(exp);
		System.out.println(result);
	}

}

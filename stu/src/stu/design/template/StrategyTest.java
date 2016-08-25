package stu.design.template;

/**
 * 首先将exp和"\\+"做参数，调用AbstractCalculator
 * 类里的calculate(String,String)方法，在calculate(String,String)
 * 里调用同类的split()，之后再调用calculate(int ,int)方法，从这个方法进入
 * 到子类中，执行完return num1 + num2后，将值返回到AbstractCalculator类，
 * 赋给result，
 * 
 * StrategyTest
 * 
 * lijq
 * 2016年7月28日 下午4:29:32
 * 
 * @version 1.0.0
 *
 */
public class StrategyTest {
	public static void main(String[] args) {

		String exp = "2+8";
		AbstractCalculator cal = new Plus();  
        Double result = cal.calculate(exp, "\\+");  
        System.out.println(result);
	}

}

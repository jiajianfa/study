package stu.design.strategy;

import java.math.BigDecimal;

public class Mutiply extends AbstractCalculator implements ICalculator {

	@Override
	public Double calculate(String exp) {
		BigDecimal[] num = split(exp, "\\*");
		return (num[0].multiply(num[1])).doubleValue();
	}

}

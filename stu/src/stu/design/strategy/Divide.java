package stu.design.strategy;

import java.math.BigDecimal;

public class Divide extends AbstractCalculator implements ICalculator {

	@Override
	public Double calculate(String exp) {
		BigDecimal[] num = split(exp, "\\/");
		return (num[0].divide(num[1])).doubleValue();
	}

}

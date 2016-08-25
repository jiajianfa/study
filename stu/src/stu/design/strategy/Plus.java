package stu.design.strategy;

import java.math.BigDecimal;

public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public Double calculate(String exp) {
		BigDecimal[] num = split(exp, "\\+");
		return (num[0].add(num[1])).doubleValue();
	}

}

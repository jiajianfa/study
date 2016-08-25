package stu.design.template;

import java.math.BigDecimal;

public class Plus extends AbstractCalculator{

	@Override
	public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
		return num1.add(num2);
	}

}

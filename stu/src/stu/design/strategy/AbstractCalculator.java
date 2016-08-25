package stu.design.strategy;

import java.math.BigDecimal;

/**
 * 辅助类，拆分每个值
 * 
 * AbstractCalculator
 * 
 * lijq
 * 2016年7月28日 下午3:01:21
 * 
 * @version 1.0.0
 *
 */
public abstract class AbstractCalculator {

	/**
	 * 返回参与算法的对应值
	 * split
	 * @param exp 表达式
	 * @param opt 算法符号
	 * @return 
	 * BigDecimal[]
	 * @exception 
	 * @since  1.0.0
	 */
	public BigDecimal[] split(String exp, String opt) {
		String[] numStr = exp.split(opt);
		BigDecimal[] num = new BigDecimal[2];
		num[0] = BigDecimal.valueOf(Double.parseDouble(numStr[0]));
		num[1] = BigDecimal.valueOf(Double.parseDouble(numStr[1]));
		return num;
	}
	
}

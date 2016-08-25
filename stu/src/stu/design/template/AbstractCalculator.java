package stu.design.template;

import java.math.BigDecimal;

/**
 * 模板方法模式
 * 
 * AbstractCalculator
 * 
 * lijq
 * 2016年7月28日 下午4:27:30
 * 
 * @version 1.0.0
 *
 */
public abstract class AbstractCalculator {
	
	/*主方法，实现对本类其它方法的调用*/  
    public final Double calculate(String exp,String opt){  
        BigDecimal[] array = split(exp,opt); 
        return calculate(array[0],array[1]).doubleValue(); //调用抽象方法  
    }  
      
    /*被子类重写的方法*/  
    abstract public BigDecimal calculate(BigDecimal num1,BigDecimal num2);

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

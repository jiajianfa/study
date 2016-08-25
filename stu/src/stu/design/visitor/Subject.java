package stu.design.visitor;

/**
 * 
 * 
 * Subject
 * 
 * lijq
 * 2016年8月4日 上午9:24:08
 * 
 * @version 1.0.0
 *
 */
public interface Subject {
	/**
	 * 接受将要访问自己的对象
	 * accept
	 * @param visitor 
	 * void
	 * @exception 
	 * @since  1.0.0
	 */
	public void accept(Visitor visitor);

	/**
	 * 获取将要被访问的属性
	 * getSubject
	 * @return 
	 * String
	 * @exception 
	 * @since  1.0.0
	 */
	public String getSubject();
}
package stu.design.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

import sun.jdbc.odbc.ee.ConnectionPool;

/**
 * 享元模式
 * 享元模式的主要目的是实现对象的共享，即
 * 共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用
 * ConnectionPoll
 * 
 * lijq
 * 2016年7月28日 上午11:17:17
 * 
 * @version 1.0.0
 *
 */
public class ConnectionPoll {

	private Vector<Connection> pool;

	/* 公有属性 */
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private int poolSize = 100;
	private static ConnectionPool instance = null;
	Connection conn = null;

	/* 构造方法，做一些初始化工作 */
	private ConnectionPoll() {
		pool = new Vector<Connection>(poolSize);

		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/* 返回连接到连接池 */
	public synchronized void release() {
		pool.add(conn);
	}

	/* 返回连接池中的一个数据库连接 */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		} else {
			return null;
		}
	}

}

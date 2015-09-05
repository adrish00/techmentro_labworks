package org.techmentro.training.struts2x.dao;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
public abstract class AbstractDao {
	static Properties properties = null;
	public Connection getConnection() throws Exception{
		if(properties == null){
			properties = new Properties();
			InputStream in = AbstractDao.class.getResourceAsStream("/db.properties");
			properties.load(in);
			in.close();
		}	
		Class.forName(properties.getProperty("driverClass"));
		Connection connection = DriverManager.getConnection	(properties.getProperty("url")
															,properties.getProperty("user")
															,properties.getProperty("password"));
		connection.setAutoCommit(false);
		return connection;
	}
	public void connectionClose(Connection connection) throws Exception{
		connection.close();
	}
	public void connectionCommit(Connection connection) throws Exception{
		connection.commit();
	}
	public void connectionRollback(Connection connection) throws Exception{
		connection.rollback();
	}
}

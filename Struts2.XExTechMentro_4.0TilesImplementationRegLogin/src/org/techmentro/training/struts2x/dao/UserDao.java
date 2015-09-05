package org.techmentro.training.struts2x.dao;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

import org.techmentro.training.struts2x.model.User;
public class UserDao extends AbstractDao {
	public int save(User user) throws Exception{
		int i = 0 ;
		Connection connection = getConnection();
		PreparedStatement stmt = connection.prepareStatement("insert into usermaster"
				+ "(name,mailId,password) values (?,?,?)",Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1, user.getName());
		stmt.setString(2, user.getMailId());
		stmt.setString(3, user.getPassword());
		i = stmt.executeUpdate();
		if(i==0){
			connectionRollback(connection);
			throw new SQLException("Exception occured while registering user");
		}
		ResultSet generatedKeys = null;
		generatedKeys = stmt.getGeneratedKeys();
        if (generatedKeys.next()) {
            user.setId(generatedKeys.getInt(1));
        } else {
        	connectionRollback(connection);
            throw new SQLException("Creating user failed, no generated key obtained.");
        }
		generatedKeys.close();
		stmt.close();
		connectionCommit(connection);
		connectionClose(connection);
		return i;
	}
	public boolean find(User user) throws Exception{
		Connection connection = getConnection();
		boolean flag = false ;
		PreparedStatement ps = connection.prepareStatement("select id,name from usermaster where"
				+ " mailId = ? and password = ?");
		ps.setString(1, user.getMailId());
		ps.setString(2, user.getPassword());
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			flag = true;
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
		}
		connectionClose(connection);
		return flag;
	}
	public Set<User> getAllUsers() throws Exception{
		Set<User> users = new HashSet<User>();
		Connection connection = getConnection();
		PreparedStatement ps = connection.prepareStatement("select id,name,mailId,password from usermaster");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			User user = new User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setMailId(rs.getString(3));
			user.setPassword(rs.getString(4));
			users.add(user);
		}
		rs.close();
		ps.close();
		connectionClose(connection);
		return users;
	}
}

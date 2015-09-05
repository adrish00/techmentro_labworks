package org.techmentro.spring.web.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.techmentro.spring.web.mvc.model.User;

public class UserDao {
	DataSource dao;
	/**
	 * @param dao the dao to set
	 */
	public void setDao(DataSource dao) {
		this.dao = dao;
	}
	public UserDao() {
		// TODO Auto-generated constructor stub
	}
	public int save(User user) throws Exception{
		int i = 0;
		Connection con = dao.getConnection();
		String sql = "insert into usermaster(name,mailid,password) values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getMailId());
		ps.setString(3, user.getPassword());
		i=ps.executeUpdate();
		con.commit();
		ps.close();
		con.close();
		return i;
	}
	public User login(String mailId,String password) throws Exception{
		User user = null;
		Connection con = dao.getConnection();
		String sql = "select id,name,mailid from usermaster where mailid= ? and password = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, mailId);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			user = new User();
			user.setMailId(mailId);
			user.setName(rs.getString("name"));
			user.setId(rs.getInt("id"));
		}
		rs.close();
		ps.close();
		con.close();
		return user;
	}
}

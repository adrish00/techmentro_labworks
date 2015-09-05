package org.techmentro.spring.web.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;

//import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.techmentro.spring.web.mvc.model.User;

public class UserDaoJdbcTemplate {
	JdbcTemplate template;
	/**
	 * @param template the template to set
	 */
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	/**
	 * @param dao the dao to set
	 */
	
	public UserDaoJdbcTemplate() {
		// TODO Auto-generated constructor stub
	}
	public void save(final User user) throws Exception{
		//int i = 0;
		
		PreparedStatementCreator psc = new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				String sql = "insert into usermaster (name,mailid,password) values (?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user.getName());
				ps.setString(2, user.getMailId());
				ps.setString(3, user.getPassword());
				return ps;
			}
		};
		
		template.update(psc);
		//return i;
	}
	/*public User login(String mailId,String password) throws Exception{
		User user = null;
		Connection con = dao.getConnection();
		con.setAutoCommit(false);
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
	}*/
}

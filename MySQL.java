package dbconsole;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQR {
	//JDBC�h���C�o�̓o�^
	String driver;
	//�f�[�^�x�[�X�̎w��
	String server, dbname, url, user, password;
	Connection con;
	Statement stmt;
	ResultSet rs;
	public MySQR() {
		this.driver = "org.gjt.mm.mysql.Driver";
		this.server = "j11000.sangi01.net";
		this.dbname = "javaapplication";
		this.url = "jdbc:mysql://"+server+"/"+dbname+"? useUnicode=true&characterEncoding=UTF-8";
		this.user = "javaapplication";
		this.password = "javaapplication";
		try {
			this.con = DriverManager.getConnection(url,user,password);
			this.stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	try{
			Class.forName(driver);
	}catch (ClassNotFoundException e){
			//TODO AUTO-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close(){
		
		try {
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ResultSet selectAll(){
		String sql = "SELECT * FROM scores";
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}

	
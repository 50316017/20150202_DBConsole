package dbconsole;


import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
	int tojo,kakutoku;
		String kisen;
		ResultSet rs;
		MySQL mysql = new MySQL(null);
		rs = mysql.selectAll();
		
		
				
			
		

		try {
			while(rs.next()){
				kisen = rs.getString("���햼");
				tojo = rs.getInt("�o���");
				kakutoku = rs.getInt("�^�C�g���l����");
					System.out.println("���햼:"+kisen);
					System.out.println("�o���:"+tojo);
					System.out.println("�^�C�g���l����:"+kakutoku);
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}


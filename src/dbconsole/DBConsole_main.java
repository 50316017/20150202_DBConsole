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
				kisen = rs.getString("棋戦名");
				tojo = rs.getInt("登場回数");
				kakutoku = rs.getInt("タイトル獲得回数");
					System.out.println("棋戦名:"+kisen);
					System.out.println("登場回数:"+tojo);
					System.out.println("タイトル獲得回数:"+kakutoku);
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}


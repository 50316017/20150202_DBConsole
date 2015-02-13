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
				kisen = rs.getString("Šûí–¼");
				tojo = rs.getInt("“oê‰ñ”");
				kakutoku = rs.getInt("ƒ^ƒCƒgƒ‹Šl“¾‰ñ”");
					System.out.println("Šûí–¼:"+kisen);
					System.out.println("“oê‰ñ”:"+tojo);
					System.out.println("ƒ^ƒCƒgƒ‹Šl“¾‰ñ”:"+kakutoku);
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}


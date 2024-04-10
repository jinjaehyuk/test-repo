import java.sql.DriverManager;
import java.sql.SQLException;

public class DBcon {
	String driver = "org.mariadb.jdbc.Driver";
	Connection con;
	PreparedStatment pstmt;
	ResultSet rs;
	
	public DBcon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test","root","mariadb");
			if(con != null) {
				System.out.println("연결성공");
			}
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		}catch(SQLException e) {
			System.out.println("DB접속실패");
			e.printStackTrace();
		}
	}

	
}

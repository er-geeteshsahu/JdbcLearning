package DataBaseLearning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainClass {
public static void main(String[] args){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select*from student");
		
		while(rs.next()){
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getInt(3));
		}
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
}


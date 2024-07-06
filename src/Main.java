import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc=new Scanner(System.in);
		String dbURL = "jdbc:mysql://localhost:3306/dan";
			Connection con = DriverManager.getConnection(dbURL,"root","dan123");
			if (con!= null) {
				System.out.println("connected . . . .");
//				System.out.println();
//			String query = "select * from products";
//		PreparedStatement statement = con.prepareStatement(query);
//		
//		ResultSet resultSet = statement.executeQuery();
//		while (resultSet.next()) {
// System.out.println("Product  : [id : "+ resultSet.getString("product_id")+",title : "+ resultSet.getString("title")+", price : "+resultSet.getString("price")+",stock : "+resultSet.getString("stock")+"]");			
//		}
			System.out.println("enter the id of product :");
			int i = sc.nextInt();
			String query = "select * from products ";
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				 System.out.println("Product  : [id : "+ resultSet.getString("product_id")+",title : "+ resultSet.getString("title")+", price : "+resultSet.getString("price")+",stock : "+resultSet.getString("stock")+"]");			
						}	
			}

			
			
System.out.println("finished . . . . .");
	}
	
	
	
}

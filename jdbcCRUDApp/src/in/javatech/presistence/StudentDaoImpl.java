package in.javatech.presistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import in.javatech.dto.Student;

public class StudentDaoImpl implements RStudentDao {
	final String DATABASE = "jdbc:mysql://localhost:3306/CrudAppData";
	final String USERNAME = "demo_user";
	final String PASSWORD = "demo_pass";
	
	Student std = new Student();
	
		public String addStudent(Integer sid, String sname, Integer sage, String saddress) {
			
			
			final String INSERT = "insert into StudentInfo values(?,?,?,?)";
			
			try {
				Connection con = DriverManager.getConnection(DATABASE,USERNAME,PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(INSERT);
				pstmt.setInt(1, sid);
				pstmt.setString(2, sname);
				pstmt.setInt(3, sage);
				pstmt.setString(4, saddress);
				int rowAffected = pstmt.executeUpdate();
				if(rowAffected>0) return "success";
			} catch (Exception e) {
				// TODO: handle exception
			}
			return "fail";
		}
	
		
		public Student searchStudent(Integer sid) {
			final String SHOW = "select * from studentinfo where id = ?";
			
			try {
				Connection con = DriverManager.getConnection(DATABASE,USERNAME,PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(SHOW);
				pstmt.setInt(1, sid);
				
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					std.setSid(rs.getInt(1));
					std.setSname(rs.getString(2));
					std.setSage(rs.getString(3));
					std.setSaddress(rs.getString(4));
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			return std;
		}
	
		
		public String upadateStudent(Integer sid, String sname, Integer sage, String saddress) {
			final String UPDATE = "update studentinfo set name = ?,age = ?,address = ? where id = ?";
			try {
				Connection con = DriverManager.getConnection(DATABASE,USERNAME,PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(UPDATE);
				pstmt.setString(1, sname);
				pstmt.setInt(2, sage);
				pstmt.setString(3, saddress);
				pstmt.setInt(4, sid);
				
				int rowAffected = pstmt.executeUpdate();
				if(rowAffected>0) return "success";
			} catch (Exception e) {
				// TODO: handle exception
			}
			return "fail";
			
		}
	
		
		public String deleteStudent(Integer sid) {
				final String DELETE = "delete from studentinfo where id=(?)";
			
			try {
				Connection con = DriverManager.getConnection(DATABASE,USERNAME,PASSWORD);
				PreparedStatement pstmt = con.prepareStatement(DELETE);
				pstmt.setInt(1, sid);
				
				int rowAffected = pstmt.executeUpdate();
				if(rowAffected>0) return "success";
			} catch (Exception e) {
				// TODO: handle exception
			}
			return "fail";
		}
}

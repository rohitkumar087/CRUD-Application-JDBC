package in.javatech.presistence;

import in.javatech.dto.Student;

public interface RStudentDao {
	// Operations to implemented
	
	public String addStudent(Integer sid ,String sname , Integer sage , String saddress);
	
	public Student searchStudent(Integer sid);
	
	public String upadateStudent(Integer sid ,String sname , Integer sage , String saddress);
	
	public String deleteStudent(Integer sid);
}

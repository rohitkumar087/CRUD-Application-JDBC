package in.javatech.service;

import in.javatech.dto.Student;

public interface RStudentService {
	
	public String addStudent(Integer sid ,String sname , Integer sage , String saddress);
	
	public Student searchStudent(Integer sid);
	
	public String upadateStudent(Integer sid ,String sname , Integer sage , String saddress);
	
	public String deleteStudent(Integer sid);

}

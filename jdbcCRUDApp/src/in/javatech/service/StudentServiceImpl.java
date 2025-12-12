package in.javatech.service;

import in.javatech.daofactory.StudentDaoFactory;
import in.javatech.dto.Student;
import in.javatech.presistence.RStudentDao;
import in.javatech.servicefactory.StudentServiceFactory;

public class StudentServiceImpl implements RStudentService{

	RStudentDao studentdao;
	public String addStudent(Integer sid, String sname, Integer sage, String saddress) {
		studentdao = StudentDaoFactory.getStudentDao();
		String data = studentdao.addStudent(sid, sname, sage, saddress);
		return data;
	}

	
	public Student searchStudent(Integer sid) {
		studentdao = StudentDaoFactory.getStudentDao();
		Student data = studentdao.searchStudent(sid);
		return data;
	}

	
	public String upadateStudent(Integer sid, String sname, Integer sage, String saddress) {
		studentdao = StudentDaoFactory.getStudentDao();
		String data = studentdao.upadateStudent(sid, sname, sage, saddress);
		return data;
	}

	@Override
	public String deleteStudent(Integer sid) {
		studentdao = StudentDaoFactory.getStudentDao();
		String data = studentdao.deleteStudent(sid);
		return data;
	}

}

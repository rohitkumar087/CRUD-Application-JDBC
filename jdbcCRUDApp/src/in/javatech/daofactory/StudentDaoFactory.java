package in.javatech.daofactory;

import in.javatech.presistence.RStudentDao;
import in.javatech.presistence.StudentDaoImpl;

public class StudentDaoFactory {
	
	private StudentDaoFactory() {}
	
	private static RStudentDao studentDao = null;
	
	public static RStudentDao getStudentDao() {
		if(studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}
	
}

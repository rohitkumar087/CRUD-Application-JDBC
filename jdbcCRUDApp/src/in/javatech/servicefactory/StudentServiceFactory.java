package in.javatech.servicefactory;

import in.javatech.service.RStudentService;
import in.javatech.service.StudentServiceImpl;

// Connection connection = DriverManager.getConnection(url,username,password);
public class StudentServiceFactory {
	
	// Make constructor private to avoid object creation
	
	private StudentServiceFactory(){
		
	}
	
	private static RStudentService studentservice = null;
	
	public static RStudentService getStudentService() {
		if(studentservice==null) {
			studentservice = new StudentServiceImpl();
		}
		return studentservice;
	}
	
}

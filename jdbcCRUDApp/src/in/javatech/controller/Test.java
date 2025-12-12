package in.javatech.controller;

import java.util.Scanner;

import in.javatech.dto.Student;
import in.javatech.service.RStudentService;
import in.javatech.servicefactory.StudentServiceFactory;

public class Test {

	public static void main(String[] args) {
		RStudentService studentservice = StudentServiceFactory.getStudentService();
				Student std = new Student();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("------ Student Management System ------");
			System.out.println("Enter 1 to Insert Student Data");
			System.out.println("Enter 2 to Show Student Data");
			System.out.println("Enter 3 to Delete any Data");
			System.out.println("Enter 4 to Updata the Data");
			System.out.println("Enter 5 for Exit");
			System.out.println();
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Insert student detail:-");
				System.out.println();
				
				System.out.println("Enter Id :");
				int sid = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Name :");
				String sname = sc.nextLine();
				
				System.out.println("Enter age :");
				int sage = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter address :");
				String saddress = sc.nextLine();
				
				String msg = studentservice.addStudent(sid, sname, sage, saddress);
				if(msg.equalsIgnoreCase("success")){
					System.out.println("Record Inserted successfully");
				}
				else {
					System.out.println("Record Insertion Failed");
				}
				break;
				
			case 2:
				System.out.println("Enter Id to Show the data :");
				int sid3 = sc.nextInt();
				Student s1 = studentservice.searchStudent(sid3);
				System.out.println(s1.toString());
				break;
					
			case 3:
				System.out.println("Insert Id to delete the data :");
				int sid1 = sc.nextInt();
				String msg1 = studentservice.deleteStudent(sid1);
				if(msg1.equalsIgnoreCase("success")){
					System.out.println("Record deleted from the data");
				}
				else {
					System.out.println("Record Deletion Failed");
				}
				break;
				
			case 4:
				System.out.println("Enter Id where you want to update data :");
				int sid2 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the name to be update :");
				String sname2 = sc.nextLine();
				
				System.out.println("Enter the age to be update :");
				int sage2 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the address to be update :");
				String saddress2 = sc.nextLine();
				
				String msg2 = studentservice.upadateStudent(sid2, sname2, sage2, saddress2);
				
				
				if(msg2.equalsIgnoreCase("success")){
					System.out.println("Record updation successfully");
				}
				else {
					System.out.println("Record updation Failed");
				}
				break;
		
			case 5:
				System.out.println("Programme exited successfully");
				System.exit(0);
				break;
				
			default :
				
				System.out.println("Enter valid choice between 1 to 5 !");
				
			}
		}
	
	}
	

}

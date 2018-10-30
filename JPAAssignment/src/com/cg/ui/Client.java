package com.cg.ui;

import java.util.Scanner;
import java.lang.*;

import com.cg.bean.Author;

import com.cg.dao.StudentDaoImpl;

public class Client {
	static Scanner sc= null;
	static Author st= new Author();
	static StudentDaoImpl stoDao=null;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		stoDao=new StudentDaoImpl();
		System.out.println("Welcome");
		System.out.println("1. Add Author\t\t 2.Fetch Author through id");
		System.out.println("3. Update Author\t\t 4.Delete Author\t\t 5.Exit");
		/* System.out.println("Enter roll No.:");
    int rn=sc.nextInt();
		 */ //automatic generation of rollno.
		int ch=sc.nextInt();
		while(true){
		switch(ch){
		case 1: addAuthor();
		break;
		case 2: FetchAuthor();
		break;
		case 3: UpdateAuthor();
		break;
		case 4: DeleteAuthor();
		break;
		case 5: System.exit(0);
		break;
		default:System.out.println("Invalid input");
		}}


	}

	private static void addAuthor() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter first name");
	    String fnm=sc.next();
	    System.out.println("Enter middle name");
	    String mnm=sc.next();
	    System.out.println("Enter last name");
	    String lnm=sc.next();
	    System.out.println("Enter phone number");
	    Double phnno=sc.nextDouble();
	     //st.setRollNo(rn);
	    st.setfName(fnm);
	    st.setlName(mnm);
	    st.setmName(lnm);
	    st.setPhNo(phnno);
	    Author stu= stoDao.addStudent(st);
	    System.out.println("Data inserted"+ stu);
	}

	private static void DeleteAuthor() {
		// TODO Auto-generated method stub

		System.out.println("Enter id to delete");
		int id=sc.nextInt();
		System.out.println("Record Deleted :"+ stoDao.deleteStudent(id));
		
	}

	private static void UpdateAuthor() {
		// TODO Auto-generated method stub

		System.out.println("Enter author id");
		int id=sc.nextInt();
		System.out.println("Enter first name");
		String fname=sc.next();
		System.out.println("Enter middle name");
		String mname=sc.next();
		System.out.println("Enter last name");
		String lname=sc.next();
		System.out.println("Enter phone no.");
		Double phnno=sc.nextDouble();
		 Author st3=stoDao.updateStudentName(id,fname,mname,lname,phnno);
		   System.out.println("Updated"+st3);
	}

	private static void FetchAuthor() {
		// TODO Auto-generated method stub
		System.out.println("Enter author id");
	      int i= sc.nextInt();
		 Author author=stoDao.getStuByRollNo(i);
	       System.out.println(author);
	}
}
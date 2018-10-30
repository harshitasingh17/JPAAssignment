package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.bean.Author;

import com.cg.util.JPAUtil;

public class StudentDaoImpl 
{
	EntityTransaction tran=null;
	EntityManager em=null;
	public StudentDaoImpl(){
		em=JPAUtil.getEntityManager();
	}
	public Author addStudent(Author stu)
	{

		tran=em.getTransaction();
		tran.begin();
		em.persist(stu);
		tran.commit();
		return stu;
	}

	public List<Author> getAllStudents()
	{
		String selQry="SELECT st FROM Student st";
		TypedQuery myQry=em.createQuery(selQry,Author.class);
		List<Author> stuList=myQry.getResultList();
		return stuList;
	}

	public Author getStuByRollNo(int rollNo)
	{
		Author st=em.find(Author.class, rollNo);
		
		return st;
	}

	public Author updateStudentName(int id, String fName,String mName,String lName,Double phnno)
	{
		//Student st=em.find(Student.class, rno);
		tran=em.getTransaction();
		Author st= new Author();
		st.setAuthorId(id);
		st.setfName(fName);
		st.setmName(mName);
		st.setlName(lName);
		st.setPhNo(phnno);
		tran.begin();
		em.merge(st);
		tran.commit();
		return st;
	}

	public Author deleteStudent(int rollNo)
	{
		Author st=em.find(Author.class, rollNo);
		tran=em.getTransaction();
		tran.begin();
		em.remove(st);
		tran.commit();
		return st;
	}
}

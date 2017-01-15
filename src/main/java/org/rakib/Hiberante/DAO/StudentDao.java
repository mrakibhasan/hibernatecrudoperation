package org.rakib.Hiberante.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.rakib.Hibernate.DTO.Student;
import org.rakib.util.HibernateUtil;

public class StudentDao {
	
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	
	public void addStudent(){
		Student student=new Student();
		student.setStudentName("rakib4");
		student.setStundetRollNo(2995556);
		student.setCoursName("CSE4");
		
		//Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(student);
		System.out.println("Insert successfully");
		session.getTransaction().commit();
		session.close();
	
	}
	
	
	public List<Student> getAllStudent(){
		List<Student> students=new ArrayList<Student>();
		session.beginTransaction();
		students=session.createQuery("from Student").list();
		for(Student student:students){
			 System.out.println(student.getStudentName()+"   "+ student.getStundetRollNo()+"   "+student.getCoursName());
		}
		session.getTransaction().commit();
		session.close();
		return students;
	}
	public void updateStudent(){
		session.beginTransaction();
		Student student=session.get(Student.class, 2);
		student.setStudentName("Mohammad");
		student.setCoursName("mechanical");
		student.setStundetRollNo(2);
		session.update(student);
		session.getTransaction().commit();
		session.close();
	}
	public void deleteStudent() {
		session.beginTransaction();
		Student student=session.get(Student.class,4);
		session.delete(student);
		session.getTransaction().commit();
		session.close();

		
	}

}

package org.rakib.Hibernate.HibernateWithMaven;

import org.rakib.Hiberante.DAO.StudentDao;
import org.rakib.Hibernate.DTO.Student;

public class App 
{
    public static void main( String[] args ){
       StudentDao studentDao=new StudentDao();
       //studentDao.addStudent();
         studentDao.getAllStudent();
       //studentDao.updateStudent();
       //studentDao.deleteStudent();
       //to read all the students
       /*for(Student iter: studentDao.getAllStudent()) {
    	   System.out.println(iter.getStudentName()+"   "+ iter.getStundetRollNo()+"   "+iter.getCoursName());
       }*/
    }
}

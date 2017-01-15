package org.rakib.Hibernate.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="STUDNET_NAME")
	private String studentName;
	@Column(name="STUDENT_ROLLNO")
	private int stundetRollNo;
	@Column(name="COURSE_NAME")
	private String coursName;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStundetRollNo() {
		return stundetRollNo;
	}
	public void setStundetRollNo(int stundetRollNo) {
		this.stundetRollNo = stundetRollNo;
	}
	public String getCoursName() {
		return coursName;
	}
	public void setCoursName(String coursName) {
		this.coursName = coursName;
	}

}

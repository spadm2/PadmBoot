package com.first.demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentsBo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sno")
	private Long studentNo;
	@Column(name="sname")
	private String studentName;
	@Column(name="sub")
	private String subject;
	public Long getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "StudentsBo [studentNo=" + studentNo + ", studentName=" + studentName + ", subject=" + subject + "]";
	}
	
	
}

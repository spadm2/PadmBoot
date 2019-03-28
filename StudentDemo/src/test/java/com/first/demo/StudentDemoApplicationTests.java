package com.first.demo;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.first.demo.dao.StudentDao;
import com.first.demo.dao.StudentsBo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDemoApplicationTests {
	@Autowired
	StudentDao studentdao;
	
	@Test
	public void testCreateStudent() {
		StudentsBo sb = new StudentsBo();
		sb.setStudentName("naba");
		sb.setSubject("python");
		sb.setStudentNo(30l);
		studentdao.save(sb);
	}
	@Test
	public void testFindStudent() {
		Optional<StudentsBo> findById = studentdao.findById(1L);
		System.out.println(findById);
		
	}
	
	@Test
	public void testUpdateStudent() {
		Optional<StudentsBo> student = studentdao.findById(2l);
		StudentsBo studentbo = student.get();
		studentbo.setSubject("dijango");
		
		studentdao.save(studentbo);
	}
	
	@Test
	public void testRemoveStudent() {
		StudentsBo name = new StudentsBo();
		name.setStudentNo(2l);
		studentdao.delete(name);
		//one way of deleting one value "studentdao.deleteById(3l);"
	}

}

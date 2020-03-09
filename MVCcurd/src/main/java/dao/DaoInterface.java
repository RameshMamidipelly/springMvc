package dao;

import java.util.List;
import bean.Student;

public interface DaoInterface {
	public List<Student> getAllStudents();
	public String save(Student s);
	public String editStudent(Student s);
	public int deleteStudent(int id);
	

}

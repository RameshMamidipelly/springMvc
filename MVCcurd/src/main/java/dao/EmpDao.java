package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import bean.Student;

@Repository
public class EmpDao implements DaoInterface {

	JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<Student> getAllStudents() {
		String sql = "select *from Student Order By id asc";
		return this.jt.query(sql, new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int num) throws SQLException {
				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setCourse(rs.getString(3));
				return st;
			}
		});
	}

	public String save(final Student s) {
		String sql = "insert into student values(?,?,?)";
		this.jt.update(sql, new PreparedStatementSetter() {

			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, s.getId());
				ps.setString(2, s.getName());
				ps.setString(3, s.getCourse());
			}
		});
		return "results";

	}

	public String editStudent( Student s) {
	/*	String sql = "update table Student set name=?,course=? where id=?";*/
		int i = this.jt.update("update student set name='"+s.getName()+"',course='"+s.getCourse()+"' where id="+s.getId());
		
		/*String sql="update student set name=?,course=? where id=?";
			int i=jt.update(sql, new Object[]{s.getName(),s.getCourse(),s.getId()});
		*/
		System.out.println("edit stu........st............."+i);
		return "eiii";
	}

	public int deleteStudent(int id) {
		int i = this.jt.update("delete from Student where id=" + id);
		return i;
	}

	public Student getStudentId(int id) {
		String sql = "select *from Student where id=?";
		return this.jt.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Student>(Student.class));
	}
}

package dao;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import domain.Student;
import until.MyUntil;

public class Student_DaoImpl implements Student_Dao {

	Statement stm = MyUntil.getStatement();
	
	public void add(Student stu) throws SQLException {
		// TODO Auto-generated method stub
		String values = stu.getCreate_at()+","+stu.getStudent_name()+","+stu.getStudent_QQ_number()+","+stu.getStart_time()+","
						+stu.getStudent_online_number()+","+stu.getDiary_connection()+","+stu.getRecommender()+","+stu.getUpdate_at()+","
						+stu.getGraduation_school();
		stm.executeUpdate("insert into register_beijing (create_at,student_name,student_QQ_number,start_time,student_online_number,"
				+ "diary_connection,declaretion,recommender,update_at,graduation_school) values "
				+ "("+values+")");
	}

	public void delete(Student stu) throws SQLException {
		// TODO Auto-generated method stub
		stm.executeUpdate("delete from register_beijing where student_name="+stu.getStudent_name());
	}

	public Student getStu(String name) throws SQLException {
		// TODO Auto-generated method stub
		ResultSet rs = stm.executeQuery("select * from register_beijing where student_name = "+name);
		Student stu = new Student();
		stu.setId(rs.getInt("id"));
		stu.setCreate_at(rs.getDate("create_at"));
		stu.setStudent_name(rs.getString("student_name"));
		stu.setStudent_QQ_number(rs.getString("student_QQ_number"));
		stu.setStart_time(rs.getDate("start_time"));
		stu.setStudent_online_number(rs.getString("studeng_online_number"));
		stu.setDiary_connection(rs.getString("diary_connection"));
		stu.setDeclaretion(rs.getString("declaretion"));
		stu.setRecommender(rs.getString("recommender"));
		stu.setUpdate_at(rs.getDate("update_at"));
		stu.setGraduation_school(rs.getString("graduation_school"));
		return stu;
	}

	public void update(Student oldStu, Student newStu) throws SQLException {
		// TODO Auto-generated method stub
		stm.executeUpdate("update register_beijing set student_name = "+newStu.getStudent_name()+" where id = "+oldStu.getId());
	}

}

package dao;

import java.sql.SQLException;

import domain.Student;

public interface Student_Dao {

	/**
	 * 增加学生
	 * @param stu
	 * @throws SQLException 
	 */
	public void add(Student stu) throws SQLException;
	
	/**
	 * 删除学生
	 * @param stu
	 * @throws SQLException 
	 */
	public void delete(Student stu) throws SQLException;
	
	/**
	 * 查找学生，通过姓名查找
	 * @param name
	 * @return
	 * @throws SQLException 
	 */
	public Student getStu(String name) throws SQLException;
	
	/**
	 * 更新学生信息
	 * @param oldStu
	 * @param newStu
	 * @throws SQLException 
	 */
	public void update(Student oldStu,Student newStu) throws SQLException;
}

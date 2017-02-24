package domain;

import java.sql.Date;

public class Student {

	private int id;
	private Date create_at;
	private String student_name;
	private String student_QQ_number;
	private Date start_time;
	private String student_online_number;
	private String diary_connection;
	private String declaretion;
	private String recommender;
	private Date update_at;
	private String graduation_school;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_QQ_number() {
		return student_QQ_number;
	}
	public void setStudent_QQ_number(String student_QQ_number) {
		this.student_QQ_number = student_QQ_number;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public String getStudent_online_number() {
		return student_online_number;
	}
	public void setStudent_online_number(String student_online_number) {
		this.student_online_number = student_online_number;
	}
	public String getDiary_connection() {
		return diary_connection;
	}
	public void setDiary_connection(String diary_connection) {
		this.diary_connection = diary_connection;
	}
	public String getDeclaretion() {
		return declaretion;
	}
	public void setDeclaretion(String declaretion) {
		this.declaretion = declaretion;
	}
	public String getRecommender() {
		return recommender;
	}
	public void setRecommender(String recommender) {
		this.recommender = recommender;
	}
	public Date getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	public String getGraduation_school() {
		return graduation_school;
	}
	public void setGraduation_school(String graduation_school) {
		this.graduation_school = graduation_school;
	}
	
	
}

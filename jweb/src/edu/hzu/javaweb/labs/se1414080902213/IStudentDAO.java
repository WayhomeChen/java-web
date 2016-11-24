package com.dao;

import java.util.List;
import stu_info.Student;

public interface IStudentDAO {
	
	public abstract Student create(Student stu) throws Exception;//添加记录
	public abstract void remove(Student stu) throws Exception;//删除记录
	public abstract Student find(Student stu) throws Exception;//查询记录
	public abstract List<Student> findAll() throws Exception; //列出记录
	public abstract void update(Student stu) throws Exception; //修改记录
	
}

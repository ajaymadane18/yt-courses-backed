package com.Courses.Services;

import java.util.List;

import com.Courses.Models.Courses;

public interface CourseService {
	public void saveData(Courses c);
    public List<Courses> getAll();
    public void delete(String id);
    public void update(Courses cc,String id);
	
	
}

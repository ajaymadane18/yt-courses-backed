package com.Courses.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Courses.Models.Courses;
import com.Courses.Repo.CourseRepo;
import com.Courses.Services.CourseService;

@Service
public class CourseDao implements CourseService{
    @Autowired
	CourseRepo cr;
	@Override
	public void saveData(Courses c) {
		// TODO Auto-generated method stub
		cr.save(c);
		
	}
	@Override
	public List<Courses> getAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
		
	}
	@Override
	public void update(Courses cc, String id) {
		// TODO Auto-generated method stub
		    Courses c=cr.getById(id);
		     if(c!=null) {
		    	 c.setCourse_title(cc.getCourse_title());
		    	 c.setCource_description(cc.getCource_description());
		     }
		     cr.save(c);
		
	}
	

}

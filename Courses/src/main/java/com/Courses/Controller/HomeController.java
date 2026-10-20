package com.Courses.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Courses.Models.Courses;
import com.Courses.Services.CourseService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins="http://localhost:5173")
public class HomeController {
	@Autowired
	private CourseService c1;
	  
	@GetMapping("/getName")
    public String one() {
    	return "ajay madane";
    }
	 @PostMapping("/saveData")
	public String saveData(@RequestBody Courses c) {
		 c1.saveData(c);
		 System.out.println(c);
		return "data saved";
	}
	 
	 @GetMapping("/getData")
	public List<Courses> getall(){
    List<Courses>c2=c1.getAll();
		  return c2;
	}
	 
	 @DeleteMapping("/delete/{id}")
	 public String delete(@PathVariable String id) {
		 c1.delete(id);
		 return "course deleted";
	 }
	 @PutMapping("/update/{id}")
	 public String update(@PathVariable String id,@RequestBody Courses newCourses) {
		 c1.update(newCourses, id);
		 return "data updated";
	 }
	
}

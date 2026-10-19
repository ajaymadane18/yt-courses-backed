package com.Courses.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	  int course_id;
	  String course_title;
	  private String cource_description;
	  public int getCourse_id() {
		  return course_id;
	  }
	  public void setCourse_id(int course_id) {
		  this.course_id = course_id;
	  }
	  public String getCourse_title() {
		  return course_title;
	  }
	  public void setCourse_title(String course_title) {
		  this.course_title = course_title;
	  }
	  public String getCource_description() {
		  return cource_description;
	  }
	  public void setCource_description(String cource_description) {
		  this.cource_description = cource_description;
	  }
	  @Override
	  public String toString() {
		return "Courses [course_id=" + course_id + ", course_title=" + course_title + ", cource_description="
				+ cource_description + "]";
	  }
	  
	  

}

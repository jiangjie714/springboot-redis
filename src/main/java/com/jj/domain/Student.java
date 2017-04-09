package com.jj.domain;

import java.io.Serializable;

public class Student implements Serializable{  
  
      
    private static final long serialVersionUID = 1L;  
    private String id;  
      
    private String name;  
      
    private String age;  
      
    private String grade;  

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override  
    public String toString() {  
        return "Student [id=" + id + ", name=" + name + ", age=" + age  
                + ", grade=" + grade + "]";  
    } 
}
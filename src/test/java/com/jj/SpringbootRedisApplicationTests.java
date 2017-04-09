package com.jj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jj.domain.Student;
import com.jj.redis.RedisService;

@RunWith(SpringRunner.class)  
@SpringBootTest
public class SpringbootRedisApplicationTests {

	
	@Autowired  
    private RedisService service;  
  
    @Test  
    public void contextLoads() {  
        service.set("myname111", "刘芸");  
        Student s = new Student();  
        s.setId("11211");  
        s.setName("muyu");  
        s.setGrade("年终");  
        s.setAge("28");  
        service.set(s);  
          
        String name = service.get("myname111");  
        System.out.println("name:"+name);  
          
        Student stu = service.getStudent("11211");  
        System.out.println(stu);  
    }  
}

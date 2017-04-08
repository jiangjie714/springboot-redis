package com.jj;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@ComponentScan
public class AppMain extends SpringBootServletInitializer{

	public static void main(String[] args) {
		 SpringApplication application = new SpringApplication(AppMain.class);
		  /*
	         * Banner.Mode.OFF:关闭;
	         * Banner.Mode.CONSOLE:控制台输出，默认方式;
	         * Banner.Mode.LOG:日志输出方式;
	         */
	         application.setBannerMode(Banner.Mode.OFF);
	         application.run( args); 
	}
	  
}

package com.ziejacode.SpringDemo4;

import com.ziejacode.SpringDemo4.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemo4Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDemo4Application.class, args);
		MyController myController = (MyController) context.getBean("myController");
		myController.hello();
	}

}

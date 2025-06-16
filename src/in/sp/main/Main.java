package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.student;

public class Main {
    public static void main(String[] args) {
        String config_loc = "in/sp/resource/applicationContext.xml"; // no leading slash
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
        System.out.println("Spring container initialized!");
        student std=(student)context.getBean("stdId2");
        std.display();
    }
}

//spring-beans-xxx.jar
//2.spring-core-xxx.jar
//3.spring-context-xxx.jar
//4.common-loggin-xxx.jar
//spring-expression-xxx.jar
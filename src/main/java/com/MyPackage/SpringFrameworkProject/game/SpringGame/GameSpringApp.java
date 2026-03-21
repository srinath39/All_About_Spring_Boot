package com.MyPackage.SpringFrameworkProject.game.SpringGame;


import com.MyPackage.SpringFrameworkProject.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.MyPackage.SpringFrameworkProject.game")
public class GameSpringApp {

	public static void main(String[] args) {
		
		try(var context= new AnnotationConfigApplicationContext(GameSpringApp.class)) {
			context.getBean(GameRunner.class).run();
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}

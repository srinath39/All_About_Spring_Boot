package com.MyPackage.SpringFrameworkProject.game.SpringGame;


import com.MyPackage.SpringFrameworkProject.game.GameRunner;
import com.MyPackage.SpringFrameworkProject.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GameSpringApp {

	public static void main(String[] args) {
		
		try(var context= new AnnotationConfigApplicationContext(GameSpringApp.class)) {
			context.getBean(GameRunner.class).run();
		}
	}

}

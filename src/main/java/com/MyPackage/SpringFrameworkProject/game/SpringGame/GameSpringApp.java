package com.MyPackage.SpringFrameworkProject.game.SpringGame;


import com.MyPackage.SpringFrameworkProject.game.GameRunner;
import com.MyPackage.SpringFrameworkProject.game.GamingConsole;
import com.MyPackage.SpringFrameworkProject.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameSpringApp {

	public static void main(String[] args) {
		
		try(var context= new AnnotationConfigApplicationContext(GameConfiguration.class)) {
			// context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}

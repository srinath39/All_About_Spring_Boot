package com.MyPackage.SpringFrameworkProject.game.SpringGame;

import com.MyPackage.SpringFrameworkProject.game.GameBasicApp;
import com.MyPackage.SpringFrameworkProject.game.GameRunner;
import com.MyPackage.SpringFrameworkProject.game.GamingConsole;
import com.MyPackage.SpringFrameworkProject.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game_01){
        return new GameRunner(game_01);
    }
}

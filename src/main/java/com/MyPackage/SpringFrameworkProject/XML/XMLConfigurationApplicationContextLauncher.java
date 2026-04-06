package com.MyPackage.SpringFrameworkProject.XML;

import com.MyPackage.SpringFrameworkProject.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLConfigurationApplicationContextLauncher {
    public static void main(String[] args){

        try(var context=new ClassPathXmlApplicationContext("contextConfiguration.xml")){
           // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            context.getBean(GameRunner.class).run();
        }
    }
}

package com.MyPackage.SpringFrameworkProject.PostContructAndPreDestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class BusinessLogic{
    private Dependency dependency;
    public BusinessLogic(Dependency dependency){
        this.dependency=dependency;
        System.out.println("all objects are created");
    }

    @PostConstruct
    public void run(){
        dependency.initialization();
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Clean up");
    }
}


// prototype
@Component
class Dependency{

    public void initialization(){
        System.out.println("AFTER Object creation");
    }
}

@Configuration
@ComponentScan
public class PostConstructAndPreDestroyApplicationContext {
    public static void main(String[] args){

        try(var context=new AnnotationConfigApplicationContext(PostConstructAndPreDestroyApplicationContext.class)){

        }
    }
}
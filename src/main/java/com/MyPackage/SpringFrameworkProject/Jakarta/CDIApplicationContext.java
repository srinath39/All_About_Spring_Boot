package com.MyPackage.SpringFrameworkProject.Jakarta;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class BusinessLogic{
    private Dependency dependency;

    @Inject
    public void setDependency(Dependency dependency){
        this.dependency=dependency;
    }
}


//@Component
@Named
class Dependency{
}

@Configuration
@ComponentScan
public class CDIApplicationContext {
    public static void main(String[] args){

        try(var context=new AnnotationConfigApplicationContext(CDIApplicationContext.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
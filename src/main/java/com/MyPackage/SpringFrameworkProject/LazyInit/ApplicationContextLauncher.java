package com.MyPackage.SpringFrameworkProject.LazyInit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class DependencyA{

}

@Component
@Lazy
class BusinessLogicClass{
    private DependencyA dependencyA;

    public BusinessLogicClass(DependencyA dependencyA) {
        System.out.println("Business Logic class object initialzation going on");
        this.dependencyA = dependencyA;
    }

    public String doSomething(){
        return "Do Something";
    }
}


@Configuration
@ComponentScan
public class ApplicationContextLauncher {
    public static void main(String[] args){

        try(var context=new AnnotationConfigApplicationContext(ApplicationContextLauncher.class)){
            System.out.println("Before Business Logic class object initialzation");
            System.out.println(context.getBean(BusinessLogicClass.class).doSomething());
        }
    }
}

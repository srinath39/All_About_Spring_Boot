package com.MyPackage.SpringFrameworkProject.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessLogicClass{
    // Setter and Getter  Injection
    private DependencyA dependencyA;
    private DependencyB dependencyB;

    // By default without @Autowired annotation also we can perform constructor-based injection
    public BusinessLogicClass(DependencyA dependencyA, DependencyB dependencyB) {
        this.dependencyA = dependencyA;
        this.dependencyB = dependencyB;
    }


    public void setDependencyA(DependencyA dependencyA) {
        this.dependencyA = dependencyA;
    }

    public void setDependencyB(DependencyB dependencyB) {
        this.dependencyB = dependencyB;
    }

    public String toString(){
        return dependencyA +" and "+dependencyB;
    }
}

@Component
class DependencyA{

}

@Component
class DependencyB{

}

@Configuration
@ComponentScan
public class ApplicationContextLauncher {
    public static void main(String[] args){

        try(var context=new AnnotationConfigApplicationContext(ApplicationContextLauncher.class)){
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessLogicClass.class).toString());
        }
    }
}

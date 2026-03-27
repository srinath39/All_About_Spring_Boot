package com.MyPackage.SpringFrameworkProject.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// singleton
@Component
class Bird{

}


// prototype
@Component
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Flight{

}

@Configuration
@ComponentScan
public class ApplicationContextLauncher {
    public static void main(String[] args){

        try(var context=new AnnotationConfigApplicationContext(ApplicationContextLauncher.class)){
            System.out.println(context.getBean(Flight.class));
            System.out.println(context.getBean(Flight.class));
            System.out.println(context.getBean(Flight.class));
        }
    }
}

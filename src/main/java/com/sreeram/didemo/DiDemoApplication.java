package com.sreeram.didemo;

import com.sreeram.didemo.Controllers.ConstructorInjectedController;
import com.sreeram.didemo.Controllers.GetterInjectedController;
import com.sreeram.didemo.Controllers.HomeController;
import com.sreeram.didemo.Controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        HomeController controller =  (HomeController) ctx.getBean("homeController");
        System.out.println(controller.hello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    }
}

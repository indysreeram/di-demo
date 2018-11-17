package com.sreeram.didemo;

import com.sreeram.didemo.Controllers.ConstructorInjectedController;
import com.sreeram.didemo.Controllers.GetterInjectedController;
import com.sreeram.didemo.Controllers.HomeController;
import com.sreeram.didemo.Controllers.PropertyInjectedController;
import com.sreeram.didemo.examplebeans.FakeDataSource;
import com.sreeram.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = {"services","com.sreeram"})
public class DiDemoApplication {

    public static void main(String[] args) {

//        SpringApplication.run(DiDemoApplication.class,args);

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);

        System.out.println(fakeJmsBroker.getUsername());

        HomeController controller =  (HomeController) ctx.getBean("homeController");
        System.out.println(controller.hello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    }
}

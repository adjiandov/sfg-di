package bobi.springguru.sfgdi;

import bobi.springguru.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());


		MyController myCtr = (MyController) ctx.getBean("myController");
		System.out.println(myCtr.sayHello());

		System.out.println("-----Property-------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------Setter------");
		SetterBasedController setterBasedController = (SetterBasedController) ctx.getBean("setterBasedController");
		System.out.println(setterBasedController.getGreeting());

		System.out.println("------Constructor------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}

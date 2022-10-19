import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean01 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat01 = (Cat) applicationContext.getBean("cat");
        Cat cat02 = (Cat) applicationContext.getBean("cat");


        System.out.println("Hello world1 и Hello world2 равны? - " + bean.equals(bean01));
        System.out.println("Cat1 равен Cat2? - " + cat01.equals(cat02));


    }
}
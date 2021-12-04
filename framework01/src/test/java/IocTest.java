import edu.soft2.ioc.coffee.CoffeeBean;
import edu.soft2.ioc.coffee.CoffeeMachine;
import edu.soft2.ioc.print.Printer;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void testCoffee(){
//        CoffeeBean coffeeBean = (CoffeeBean) context.getBean("coffeeMachine");
//        coffeeBean.drink();
        CoffeeMachine machine = (CoffeeMachine) context.getBean("coffeeMachine");
        machine.make();
    }
    @Test
    public void testPrinter(){
        Printer printer = (Printer) context.getBean("printer");
        printer.print();
    }
}

import edu.soft2.pojo.User;
import edu.soft2.service.UserService;
import edu.soft2.service.impl.HelloworldService;
import edu.soft2.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class AopTest {
    int expected;//预期结果
    String name;//方法参数
    String pwd;//方法参数
    public AopTest(int expected, String name, String pwd) {
        this.expected = expected;
        this.name = name;
        this.pwd = pwd;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> t(){//测试数据
        return Arrays.asList(new Object[][]{
            {1,"peter","123"},{1,"john","456"}
        });
         }

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//    @Test
//    public void helloworldTest(){
//        HelloworldService helloworldService = (HelloworldService) context.getBean("helloworldService");
//        helloworldService.sayHello();
//        helloworldService.sayHi();
//    }
    @Test
    public void userServiceTest(){
//        String name = "peter";//模拟从客户端传来的数据
//        String pwd = "123";
        UserService service = context.getBean(UserServiceImpl.class);
//        User user = new User();
//        user.setName("peter");
//        user.setPwd("123");
//        user.setEmail("peter@test.com");
        User user = context.getBean(User.class);
        user.setName(name);
        user.setPwd(pwd);
        assertEquals(expected,service.addUser(user));
        assertEquals(expected,service.deleUser(user));
        assertEquals(expected,service.update(user));
        assertEquals(expected,service.queryUser(user));
//        if (service.addUser(user) == 1){
//            System.out.println("添加成功");
//        }else {
//            System.out.println("添加失败");
//        }
//        if (service.deleUser(user) == 1){
//            System.out.println("删除成功");
//        }else {
//            System.out.println("删除失败");
//        }
//        if (service.update(user) == 1){
//            System.out.println("修改成功");
//        }else {
//            System.out.println("修改失败");
//        }
//        if (service.viewUser(user) == 1){
//            System.out.println("查询成功");
//        }else {
//            System.out.println("查询失败");
//        }
    }
}

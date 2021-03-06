package edu.soft2.interceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import edu.soft2.pojo.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CheckUserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
//        System.out.println("CheckUserInterceptor.preHandle");
//        Object user = request.getSession().getAttribute("user");
//        if (user != null && user instanceof User) {
//            return true;//通过拦截器
//        }
//        request.getRequestDispatcher("hello.do").forward(request,response);
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("user");
        if ((obj != null ) && (obj instanceof User)){
            System.out.println("拦截器放行");
            return true;
        }
        System.out.println("因未登录，拦截器拦截");
        request.getRequestDispatcher("hello.do").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
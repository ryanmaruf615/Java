package org.learnmaruf.springbootwebproject;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request) {
       int num1 = Integer.parseInt(request.getParameter("num1"));
       int num2 = Integer.parseInt(request.getParameter("num2"));
       System.out.println(num1+num2);

        return "result.jsp";
    }
}

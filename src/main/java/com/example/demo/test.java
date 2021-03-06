package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
//@Controller
@Configuration
//@Component
@RequestMapping
public class test {
    @Autowired
    sql s;
    @ResponseBody
    @RequestMapping(value = "/xx",produces = "application/json;charset=UTF-8")
    public List<bean> xx(){
        List<bean> b = s.getAllUsers();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<b.size();i++){
            sb.append(b.get(i).id);
            sb.append(b.get(i).name);
        }

        System.out.printf("");
        System.out.printf("");
        return b;
    }
    @RequestMapping(value = "zz")
    public ModelAndView sayHello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test.html");
        //modelAndView.addObject("key", 12345);
        //System.out.println("test");
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping("/weather")
    public String weather(String name, HttpServletRequest hr) {
        Enumeration e=hr.getHeaderNames();
        while (e.hasMoreElements()){
            String s=(String) e.nextElement();
            System.out.printf(s+":"+hr.getHeader(s)+"\n");
        }
        System.out.println();
        return com.example.demo.weather.test.get_weather(name);
    }
}

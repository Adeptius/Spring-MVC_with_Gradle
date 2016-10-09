package ua.adeptius.spring.mvc.web;


import  org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.Map;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model){
        model.put("Current time", new Date().toString());
        return "index";
    }
}

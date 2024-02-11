package com.example.ToDoApp.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ToDoController {

    private final Logger log = LoggerFactory.getLogger(ToDoController.class);
    @GetMapping("/")
    public ModelAndView index() {
            log.debug("Request to load the home page");
            ModelAndView modelAndView=new ModelAndView("index");
            return  modelAndView;
    }

}

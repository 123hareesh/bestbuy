package com.example.firstgroovyproject

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.servlet.ModelAndView
@Controller
class HomeController
{


        @RequestMapping(value="/save", method= RequestMethod.POST)
        public ModelAndView save(@ModelAttribute User user)
        {
            ModelAndView modelAndView = new ModelAndView("user-data");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
}

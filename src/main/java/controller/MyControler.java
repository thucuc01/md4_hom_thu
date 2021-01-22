package controller;

import model.Massager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyControler {
    @GetMapping
    public ModelAndView home(){
        Massager massager=new Massager();
        ModelAndView modelAndView=new ModelAndView("home","massager",massager);
        return modelAndView;

    }
    @PostMapping("/home")
    public ModelAndView go(@ModelAttribute("massager") Massager massager){
        ModelAndView modelAndView=new ModelAndView("info","massager",massager);
        return modelAndView;
    }

}

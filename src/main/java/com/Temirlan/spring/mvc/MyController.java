package com.Temirlan.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "myView";
    }

    @RequestMapping("/askEmpdetails")
    public String askDetails(){
        return "ask-detail-view";
    }

//    @RequestMapping("/showDetails")
//    public String showDetails(){
//        return "show-detail-view";
//    }

    @RequestMapping("/showDetails")
    public String showDetails(@RequestParam("emplyeeName") String name, Model model){
        name="Mr. "+name + "!";
        model.addAttribute("nameAttr",name);

        return "show-detail-view";
    }

}

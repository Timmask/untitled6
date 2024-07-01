package com.Temirlan.spring.mvc;

import com.Temirlan.spring.mvc.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String askDetails(Model model){
        model.addAttribute("employee",new Employee());

        return "ask-detail-view";
    }

//    @RequestMapping("/showDetails")
//    public String showDetails(){
//        return "show-detail-view";
//    }

    @RequestMapping("/showDetails")
    public String showDetails(@ModelAttribute("employee") Employee employee){


        return "show-detail-view";
    }

}

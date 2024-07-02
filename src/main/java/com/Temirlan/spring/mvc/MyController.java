package com.Temirlan.spring.mvc;

import com.Temirlan.spring.mvc.entity.Employee;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
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

    @RequestMapping("/showDetails")
    public String showDetails(
            @Valid @ModelAttribute("employee") Employee employee,
                              BindingResult bindingResult){
        System.out.println(employee.getSurname().length());
        if(bindingResult.hasFieldErrors()){
            return "ask-detail-view";
        }else{
            return "show-detail-view";
        }

    }

}

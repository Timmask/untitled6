package com.Temirlan.spring.mvc;

import com.Temirlan.spring.mvc.entity.Employee;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
@Validated
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
             @ModelAttribute("employee") @Valid Employee emp,
            BindingResult bi){

        System.out.println(bi);
        if(bi.hasErrors()){
            return "ask-detail-view";
        }else{
            return "show-detail-view";
        }

    }

}

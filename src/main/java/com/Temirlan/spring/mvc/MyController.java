package com.Temirlan.spring.mvc;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;


@Controller
@RequestMapping("/")
public class MyController {
    private static final Logger logger
            = LoggerFactory.getLogger(MyController.class);
    @ResponseBody()
    @RequestMapping("/")
    public String showFirstView() {
//        final String fromEmail = "k.temirlan@ic-group.kz"; //requires valid gmail id
//        final String password = "yjtaqzrewljjriew"; // correct password for gmail id
//        final String toEmail = "timakhamza@gmail.com"; // can be any email id
//
//        System.out.println("TLSEmail Start");
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.yandex.kz"); //SMTP Host
//        props.put("mail.smtp.port", "587"); //TLS Port
//        props.put("mail.smtp.auth", "true"); //enable authentication
//        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
//
//        //create Authenticator object to pass in Session.getInstance argument
//        Authenticator auth = new Authenticator() {
//            //override the getPasswordAuthentication method
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(fromEmail, password);
//            }
//        };
//        Session session = Session.getInstance(props, auth);
//
//        EmailSender.sendEmail(session, toEmail,"TLSEmail Testing Subject", "TLSEmail Testing Body");

        logger.error("test error");
        logger.debug("test debug");
        logger.warn("test warn");
        return "myView";
    }

    @RequestMapping("/askEmpdetails")
    public String askDetails() {
        logger.debug("showFirstView");
        return "ask-detail-view";
    }

//    @RequestMapping("/showDetails")
//    public String showDetails(){
//        return "show-detail-view";
//    }

    @RequestMapping("/showDetails")
    public String showDetails(
            @ModelAttribute("employee") @Valid Employee employee,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "ask-detail-view";
        } else {
            return "show-detail-view";
        }

    }

}

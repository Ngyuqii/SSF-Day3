package SSF.FormValidation.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SSF.FormValidation.model.Person;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@Controller
@RequestMapping(path="/registration")
public class RegistrationController {
    
    //Method to display form
    @GetMapping (path="/form")
    public String showForm(Model model){

     // Instantiate the person object
     Person p = new Person();
     model.addAttribute("person", p);
     return "form";
    }

    //Method to process form and perform validation
     @PostMapping (path="/record")
     public String postRegistration(@Valid Person p, BindingResult bdresult, Model model, HttpServletResponse response) throws IOException {
        if(bdresult.hasErrors()){
            return "form";
        }    
        else {
            response.setStatus(HttpServletResponse.SC_CREATED);
            return "record";
        }
     }
     
}
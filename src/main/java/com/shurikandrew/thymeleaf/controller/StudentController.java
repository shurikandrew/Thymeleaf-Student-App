package com.shurikandrew.thymeleaf.controller;

import com.shurikandrew.thymeleaf.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${langs}")
    private List<String> langs;

    @Value("${os}")
    private List<String> os;

    @GetMapping("/requestForm")
    public String form(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("countries", countries);
        model.addAttribute("langs",langs);
        model.addAttribute("os",os);
        return "form";
    }

    @PostMapping("/answerForm")
    public String findStudent(@ModelAttribute("student") Student student){

        return "answer";
    }
}

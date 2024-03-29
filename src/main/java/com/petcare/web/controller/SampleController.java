package com.petcare.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.petcare.web.service.SampleService;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("/hi")
    @ResponseBody
    public String hi() {
        return "hi " +sampleService.getName() + " : " + sampleService.now();
    }

    @GetMapping("/home")
    public String sampleView() {
        return "home";
    }
    
    @GetMapping("/hospitaldetail")
    public String hospitalDetail() {
    	return "hospitalDetail";
    }
    
    @GetMapping("/hospitalsearch")
    public String hospitalSearch() {
    	return "hospitalSearch";
    }
    
}

package com.exercise.calculator.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

@RequestMapping(value = "/hello", method= RequestMethod.GET )
public String hello(){
    return "Hello World";
}

@RequestMapping(value="/sum", method = RequestMethod.GET )
    public int sum(@RequestParam(name = "num1", defaultValue = "5")int num1, @RequestParam(name="num2", defaultValue = "5") int num2){
    return num1+num2;
}

}

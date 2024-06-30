package com.exercise.calculator.controllers;

import com.exercise.calculator.repositories.StudentRepository;
import com.exercise.calculator.services.StudentService;
import com.exercise.calculator.student.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentService;
    private final StudentRepository studentRepository;

    public StudentController(StudentService studentService, StudentRepository studentRepository){

        this.studentRepository = studentRepository;
        this.studentService = studentService;
    }

@RequestMapping(value = "/hello", method= RequestMethod.GET )
public String hello(){
    return "Hello World";
}

@RequestMapping(value="/sum", method = RequestMethod.GET )
    public int sum(@RequestParam(name = "num1", defaultValue = "5")int num1, @RequestParam(name="num2", defaultValue = "5") int num2){
    return num1+num2;
}

@RequestMapping(value="/add", method=RequestMethod.POST)
    public Student saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return student;
}

@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
        public void deleteStudent(@PathVariable Long id){
        studentRepository.deleteById(id);
}


}

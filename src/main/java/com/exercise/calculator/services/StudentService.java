package com.exercise.calculator.services;

import com.exercise.calculator.repositories.StudentRepository;
import com.exercise.calculator.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){

        this.studentRepository = studentRepository;
    }







}

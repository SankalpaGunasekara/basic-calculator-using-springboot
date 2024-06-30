package com.exercise.calculator.config;

import com.exercise.calculator.repositories.StudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Beans {

    @Bean
    public Addition getAdd(){
        return new Addition();
    }

    @Bean
    public Substraction getSubstraction(){
        return new Substraction();
    }


}

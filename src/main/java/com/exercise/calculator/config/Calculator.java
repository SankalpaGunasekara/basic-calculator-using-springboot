package com.exercise.calculator.config;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Long[] args = new Long[] {10L,25L, 34L, 42L, 56L, 73L, 89L, 91L, 58L, 67L};

    private final Addition add;
    private final Substraction subs;

    public Calculator(Addition add,Substraction sub){
        this.add = add;
        this.subs = sub;
    }

    @PostConstruct
    public void calculations(){

        if(args.length == 0){

            System.out.println("Array is empty");
        }
        else{

            for(int i = 0;i<args.length-1;i++) {
                long sum = add.addition(args[i],args[i+1]);
                long sub = subs.substract(args[i],args[i+1]);
                System.out.println("sum of "+args[i]+" and "+args[i+1]+" is = "+sum);
                System.out.println("subtraction of "+args[i]+" and "+args[i+1]+" is = "+sub);
            }
        }

    }

}

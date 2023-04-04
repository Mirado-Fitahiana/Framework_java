/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import ETU1905.framework.ClassAnnotation;
/**
 *
 * @author Mirado
 */
public class Dept {
    private String matricule;
    
    @ClassAnnotation(methodName = "number")
    public void printNumber(String number){
        System.out.println("function1 with anotation get started");
    }
    
    public void printNumber2(String number){
        System.out.println("function2 without anotation get started");
    }
    
    @ClassAnnotation(methodName = "number1")
    public void printNumber3(String number){
        System.out.println("function3 with anotation get started");
    }
}

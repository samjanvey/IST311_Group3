/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Brad
 */
public abstract class Person {
    String name;
    
    public Person(){
        name = "name";
        
    }
    
    //Constructor
    Person(String name)
    {
        this.name = name;
    }
    
    public abstract void getInfoArrayList();
    
}

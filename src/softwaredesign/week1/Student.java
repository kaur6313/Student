/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredesign.week1;

/**
 *
 * @author manjo
 */
public class Student {
    //constructor
    public Student(String n) 
    {
        this.name=n;
    }
    public Student(){
        
    }
   //data fields
    private String name;

   
  
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}

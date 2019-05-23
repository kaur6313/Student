/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 may 23,2019
 */
package softwaredesign.week1;

/**
 *
 * @author manjo
 */
public class Student {

    private int StuId;
    //constructor
    public Student(String n) 
    {
        this.name=n;
    }
    public Student(){
        
    }
   //data fields
    private String name;
    private int stuId ;

    Student(String manjot, int stuId) {
    this.name = manjot;
    this.stuId = stuId;
    
    }
   
  
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the StuId
     */
    public int getStuId() {
        return stuId;
    }

    /**
     * @param stuId
     
     */
    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

   
    
}

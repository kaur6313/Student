/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 may 23,2019 manjot
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
    private int maxCourse;
    
    

    Student(String manjot, int stuId, int maxCourse) {
    this.name = manjot;
    this.stuId = stuId;
    this.maxCourse=course;
    
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

    /**
     * @return the course
     */
    public int getMaxCourse() {
        return maxCourse;
    }

    /**
     * @param course the course to set
     */
    public void setMaxCourse(int maxCourse) {
        this.maxCcourse = maxCourse;
    }

   
    
}

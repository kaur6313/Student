/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredesign.week1;

import softwaredesign.week1.Student;

/**
 *
 * @author manjo
 */
public class TestStudent {
    public static void main(String[]args){
        Student s1=new Student("manjot");
        //s1.setName ("manjot");
        
        Student s2=new Student("kaur");
        //s2.setName ("harinder");
        
        Student s3=new Student();
        s3.setName ("randhawa");
        
        Student[] list = new Student[3]; // array of objects
        list[0]= s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++){
            System.out.println(list[i].getName());
            
            
                    
        }
        
    }
    
}

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
public class TestStudent {
    public static void main(String[]args){
        Student s1=new Student("manjot",612166868);
        //s1.setName ("manjot");
        
        Student s2=new Student("kaur",2632699);
        //s2.setName ("harinder");
        
        Student s3=new Student("randhawa",6263828);
        //s3.setName ();
        
        Student[] list = new Student[3]; // array of objects
        list[0]= s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++){
            System.out.println(list[i].getName()+" "+list[i].getStuId());
            
            
                    
        }
        
    }
    
}

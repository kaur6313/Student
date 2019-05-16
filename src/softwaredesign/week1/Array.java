
package softwaredesign.week1;

/**
 *
 * @author manjo
 */
import java.util.Scanner;

public class Array {
    public static void main(String[]args){
        //declare array
      /*  char[] n= new char[5];
        n[0] = 'h';
        n[1] = 'e';
        n[2] = 'l';
        n[3] = 'l';
        n[4] = 'o';
        // print array data using for loop
        for(int i = 0;i<n.length;i++)
        {
        System.out.print(n[i]);
        }*/
      //take input from user
        Scanner input = new Scanner(System.in);
        String word = input.next();
        //dclare array
        char[] name = new char[word.length()];
        System.out.print(name.length);
        for(int i=0;i<word.length();i++){
            name[i]=word.charAt(i);
            
        }
        for(int i=name.length-1;i>=0;i--){
            System.out.print(name[i]);
        }
        
    }
   
    
}

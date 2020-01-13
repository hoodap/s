/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.Scanner;
/**
 *
 * @author Pritam Hooda
 */

public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Student[] s = new Student[5];
      Scanner input = new Scanner(System.in);
      
    for (int i=0; i<s.length; i++){
        s[i]= new Student();
        System.out.println("Enter the name of student");
        s[i].setName(input.nextLine());
    }
    }
    
}

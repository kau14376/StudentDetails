/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetailsprint;

import java.util.Scanner;

/**
 *
 * @author srinivsi
 */
public class StudentDetailsPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // array of object decalration
         Student[] list = new Student[3];
         //take student details i/p from user
         Scanner in = new Scanner(System.in);
          //store 3 student objects in array , also define each student name , age
          for(int i=0;i<list.length;i++)
          {
              String n = in.next();
              int a= in.nextInt();
              //create object?
              Student s1 = new Student(n,a);// one object s1 details name ,age
              list[i]=s1;
          }
          for(int i=0;i<list.length;i++)
          {
              System.out.println(list[i].getName()+" "+list[i].getAge());
             
          }
         
         
    }
    
}

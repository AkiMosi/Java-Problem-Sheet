/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet7;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author 17pd04
 */
public class Worksheet7 {
    public static Scanner in = new Scanner (System.in);
    public static void one(){
        int choice,num;
        String name;
        PQ pq = new PQ();
        pq.create();
        while(true){
            System.out.println("Enter the function to be done \n1. Insert\n2. Pop\n3. Display the Queue\n");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the Number : ");
                    num = in.nextInt();
                    System.out.print("Enter the name : ");
                    name = in.next();
                    pq.insert(num, name);
                    break;
                case 2:
                    System.out.println("The first one in the queue is "+pq.next());
                    break;
                case 3:
                    pq.display();
                    break;
                default:
                    break;
            }
            System.out.print("Do you want to repeat :(0/1) ? ");
            choice = in.nextInt();
            if(choice == 0)
                break;
        }
        System.out.println("Thank You , Have a nice day ! ");
    }
    public static void two(){
        String a = "Aail";
        String b = "Abay";
        System.out.println(b.compareTo(a));
    }
    public static void main(String[] args) {
        //one();
        two();
    }
    
}

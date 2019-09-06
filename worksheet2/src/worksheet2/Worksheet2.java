/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 17pd04
 */

public class Worksheet2 {
    static Scanner in = new Scanner(System.in);
    
    public static class employee{
        String name;
        double sal;
        employee()
        {
            name="\0";
            sal=0;
        }
        employee(String x,double y)
        {
            name=x;
            sal=y;
        }
    }
    public static class student{
        String name;
        int count;
        int total;
        student(){
            name="\0";
            count=total=0;
        }
        void getname(){
            System.out.println("Enter the name of the student : ");
            name=in.nextLine();
        }
        void addquiz(int score){
            total+=score;
            count++;
        }
        int totalscore()
        {
            return total;
        }
        float getave(){
            float temp;
            temp=total/count;
            return temp;
        }
        
    }
    public static void one(){
        employee e1 = new employee();
        System.out.println("name : "+e1.name+" sal : "+e1.sal);
        employee e2=new employee("Joel",1000);
        System.out.println("name : "+e2.name+" sal : "+e2.sal);
    }
    public static void two(){
        student s1=new student();
        int choice,score;
        s1.getname();
        while(true){
            System.out.println("Enter the score : ");
            score = in.nextInt();
            s1.addquiz(score);
            System.out.println("Do you want to add another score ?(1/0): ");
            choice=in.nextInt();
            if(choice==0)
                break;
        }
        System.out.println("total score : "+s1.totalscore());
        System.out.println("ave score : "+s1.getave());
        
    }
    public static void three(){
        car c1 = new car((float) 0.5);
        c1.tank(20);
        c1.drive((float)20);
        System.out.println("Fuel left in the tank : "+c1.getfuel());
    }
    public static void four(){
        List<account>a=new ArrayList<>();
        a.add(new account(100,"joel",12345));
        a.add(new account(200,"prakash"));
        a.add(new account("ajay"));
        System.out.println(a.get(0).accno);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //one();
        //two();
        //three();
        four();
    }
    
}

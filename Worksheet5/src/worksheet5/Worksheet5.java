/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet5;
import java.util.Scanner;
import MyJavaPackage.MyProgram.Test;
import Word.SentenceGenerate;
import Word.WordGenerate;
import MyJavaPackage.MyAnimals.Animal;
import MyJavaPackage.MyAnimals.Cat;
import MyJavaPackage.MyAnimals.Fish;
import MyJavaPackage.MyAnimals.Pet;
import MyJavaPackage.MyAnimals.Spider;
/**
 *
 * @author 17pd04
 */
public class Worksheet5 {
    static Scanner in = new Scanner(System.in);
    /**
     */
    public static void one(){
        Test obj = new Test();
        obj.interactive();
    }
    public static void two(){
        SentenceGenerate obj1 = new SentenceGenerate();
        WordGenerate obj2 = new WordGenerate(); 
        int choice;
              
        String verb[]=new String[5];
        String noun[]=new String[5];
        String temp;
        System.out.println("Enter the choice :\n1. Sentence Generate \n2. Word"
                + " Generate ");
        choice=in.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter 5 noun ");
                for(int i=0;i<5;i++){
                    System.out.print("Enter the noun "+(i+1)+" : ");
                    noun[i]=in.next();                   
                }
                System.out.println("\nEnter 5 verb ");
                for(int i=0;i<5;i++){
                    System.out.print("Enter the verb "+(i+1)+" : ");
                    verb[i]=in.next();                   
                }
                System.out.println("The generated Sentence : ");
                obj1.getNV(noun, verb);
                obj1.SenGen();
                break;
            case 2:
                System.out.println("Enter a word ");
                String str = in.next();
                System.out.println("Enter the number of times the word should be"
                        + "repeated : ");
                int num = in.nextInt();
                obj2.repeatEnd(str,num);
                break;
        }
    }
    public static void three(){
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        
        //fish-fish
        System.out.println("fish-fish");
        d.setName("Prakash");
        System.out.println("Name of the fish is "+d.getName());
        d.play();
        d.walk();
        d.eat();
        
        //cat-cat
        System.out.println("cat-cat");
        c.walk();
        c.eat();
        c.setName("Joe");
        System.out.println("Name of the pussy is "+c.getName());
        c.play();
        
        //animal-fish
        System.out.println("animal-fish");
        a.walk();
        a.eat();
        
        //animal-spider
        System.out.println("animal-spider");
        e.walk();
        e.eat();
        
        //pet-cat
        p.setName("Ajay");
        System.out.println("Name of the pussy is "+p.getName());
        p.play();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //one();
        //two();
        three();
    }
    
}

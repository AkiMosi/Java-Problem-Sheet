/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaPackage.MyProgram;
import MyJavaPackage.MyConversion.Conversion;
import java.util.Scanner;
/**
 *
 * @author 17pd04
 */
public class Test {
    static Scanner in = new Scanner(System.in);
    public void interactive(){
        Conversion obj = new Conversion();
        String end;
        int choice;
        while(true){
            System.out.println("Enter the Choice : \n1. Convert Inches to cm \n2. Covert cm to inches");
            choice=in.nextInt();
            float input,output;
            switch(choice){
                case 1:
                    System.out.println("Enter the unit in Inches : ");
                    input=in.nextFloat();
                    output=obj.inch2cm(input);
                    System.out.println(input+" inch = "+output+" cm");
                    break;
                case 2:
                    System.out.println("Enter the unit in cm : ");
                    input=in.nextFloat();
                    output=obj.cm2inch(input);
                    System.out.println(input+" cm = "+output+" inch");
                    break;  
                case 3:
                    System.out.println("Enter the unit in pounds : ");
                    input=in.nextFloat();
                    output=obj.pound2kilo(input);
                    System.out.println(input+" pounds = "+output+" kg");
                    break;
                case 4:
                    System.out.println("Enter the unit in kg : ");
                    input=in.nextFloat();
                    output=obj.kilo2pound(input);
                    System.out.println(input+" kg = "+output+" pound");
                    break;
                case 5:
                    System.out.println("Enter the unit in miles : ");
                    input=in.nextFloat();
                    output=obj.mile2km(input);
                    System.out.println(input+" miles = "+output+" km");
                    break;
                case 6:
                    System.out.println("Enter the unit in minutes : ");
                    input=in.nextFloat();
                    output=obj.min2hr(input);
                    System.out.println(input+" minutes = "+output+" hours");
                    break;
                case 7:
                    System.out.println("Enter the unit in minutes : ");
                    input=in.nextFloat();
                    output=obj.min2sec(input);
                    System.out.println(input+" min = "+output+" seconds");
                    break;
                case 8:
                    System.out.println("Enter the unit in F : ");
                    input=in.nextFloat();
                    output=obj.fah2cel(input);
                    System.out.println(input+" F = "+output+" celcius");
                    break;
                case 9:
                    System.out.println("Enter the unit in C : ");
                    input=in.nextFloat();
                    output=obj.cel2fah(input);
                    System.out.println(input+" C = "+output+" F");
                    break;
            }
            System.out.println("Do you want to repeat ?(y:n) : ");
            end=in.next();
            if("n".equals(end))
                break;                    
        }
    }
}

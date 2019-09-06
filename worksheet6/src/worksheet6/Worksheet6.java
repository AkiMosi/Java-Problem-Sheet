/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet6;
import java.util.Scanner;
/**
 *
 * @author 17pd04
 */
public class Worksheet6 {
    public static Scanner in = new Scanner(System.in);
    /**
     */
    public static void one(){
        int temp;
        String choice;
        while(true){
            System.out.println("Enter the sequence of integers : ");
            int sum = 0;
            while(true){
                temp = in.nextInt();
                if(temp == 0)
                    break;
                sum+=temp;
            }
            System.out.println("The sum is "+sum+"\nDo you want to repeat ?("
                + "y/n) : ");
            choice = in.next();
            if(!"n".equals(choice)) {
            } else {
                break;
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        one();
    }
    
}

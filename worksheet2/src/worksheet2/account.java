/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 17pd04
 */
public class account {
    double balance;
    String owner;
    int id;
    long accno;
    static int index=0;
    static List<Long> number=new ArrayList<>();

    public account(double initBal,String owner,long number){
        balance =initBal;
        this.owner=owner;
        NumCheck(number);
        id=index;
        accno=account.number.get(index);
        index++;
    }
    public account(double initBal,String owner){
        balance=initBal;
        this.owner=owner;
        RanNum();
        id=index;
        accno=account.number.get(index);
        index++;
    }
    public account(String owner){
        this.owner=owner;
        balance=0;
        RanNum();
        id=index;
        accno=account.number.get(index);
        index++;
    }
    public static void RanNum(){
        int count=0;
        while(true){
            long temp=(ranran(1000,9999));
            for(int i=0;i<index;i++)
                if(temp!=account.number.get(i))
                    count++;
            if(count==account.number.size()){
                account.number.add(temp);
                break;
            }
        }
    }
    public static void NumCheck(long number){
        int count=0;
        for(int i=0;i<index;i++)
            if(number!=account.number.get(i))
                count++;
        if(count==account.number.size())
                account.number.add(number);
            else
                System.out.println("The Account Number already exist\nTry again with another number ");
    }
    public static long ranran(long min, long max){
        long x = (long)(Math.random()*((max-min)+1))+min;
        return x;
    }
    
}
